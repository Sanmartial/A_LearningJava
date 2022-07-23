package LessonsJava.patternsProgramming.ObjectPool;

import java.util.LinkedList;
import java.util.List;

public class ObjectPoolTest {
    public static void main(String[] args) {
ObjectPool objectPool = new ObjectPool();
PooledObject pooledObject = objectPool.getPooledObject();
objectPool.realisePooledObject(pooledObject);
    }
}
class PooledObject{}

class ObjectPool{
    List<PooledObject> free = new LinkedList<>();
    List<PooledObject> used = new LinkedList<>();

    public PooledObject getPooledObject(){
        if(free.isEmpty()){
            PooledObject pooledObject = new PooledObject();
            free.add(pooledObject);
            return pooledObject;
        }
        else {
            PooledObject pooledObject = free.get(0);
            used.add(pooledObject);
            free.remove(pooledObject);
            return pooledObject;

        }
    }
    public  void realisePooledObject(PooledObject pooledObject){
        used.remove(pooledObject);
        free.add(pooledObject);
    }

}