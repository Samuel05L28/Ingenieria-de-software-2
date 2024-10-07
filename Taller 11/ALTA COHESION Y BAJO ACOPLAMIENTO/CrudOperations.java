public interface CrudOperations<T> {
    void save(T t);
    T find(int id);
    void update(T t);
    void delete(int id);
}