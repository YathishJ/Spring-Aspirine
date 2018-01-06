package com.aspirine.global.abstracts;

import org.ektorp.CouchDbConnector;
import org.ektorp.DocumentNotFoundException;
import org.ektorp.DocumentOperationResult;
import org.ektorp.UpdateConflictException;
import org.ektorp.support.CouchDbRepositorySupport;
import org.springframework.util.Assert;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static com.aspirine.global.abstracts.RepositoryConstants.ID_SEPARATOR;
import static jdk.nashorn.internal.objects.NativeArray.join;

/**
 * Abstract Repository to support CouchDB operation for {@link MathDocument}
 *
 * @author yathish
 */
public abstract class MathRepository<T extends MathDocument> extends CouchDbRepositorySupport<T> {

    protected MathRepository(Class<T> type, CouchDbConnector db) {
        super(type, db);
    }

    @Override
    public void add(T entity) throws UpdateConflictException {
        entity.setId(calculateId(entity));
        entity.setType(getType(entity.getClass()));
        super.add(entity);
    }

    @Override
    public T get(String id) throws DocumentNotFoundException {
        return super.get(id);
    }

    @Override
    public List<T> getAll() {
        return super.getAll();
    }

    @Override
    public void update(T entity) throws UpdateConflictException {
        Assert.notNull(entity.getId(), "_id cannot be null");
        entity.setType(getType(entity.getClass()));
        super.update(entity);
    }

    public List<DocumentOperationResult> executeBulk(Collection<T> objects) {

        List<T> docs = new ArrayList<>();
        for (T object : objects) {
            if (object.isNew()) {
                object.setId(calculateId(object));
            }
            object.setType(getType(object.getClass()));
            docs.add(object);
        }
        return db.executeBulk(docs);
    }

    protected abstract String calculateId(T doc);

    protected static String buildId(String documentType, Object... components) {
        return documentType + ID_SEPARATOR + join(components, ID_SEPARATOR);
    }

    protected static String buildId(Class<? extends MathDocument> clazz, Object... components) {
        return buildId(getType(clazz), components);
    }

    protected static String getType(Class<?> clazz) {
        return clazz.getSimpleName();
    }

}
