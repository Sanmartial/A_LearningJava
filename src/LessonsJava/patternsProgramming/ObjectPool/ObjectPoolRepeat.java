package LessonsJava.patternsProgramming.ObjectPool;

import java.util.LinkedList;
import java.util.List;

public class ObjectPoolRepeat {
    public static void main(String[] args) {
        ObjPool objPool = new ObjPool();
        PoolObj poolObj = objPool.getPoolObj();
        objPool.realisePoolObject(poolObj);
    }
}
class PoolObj{}

class ObjPool{
    List<PoolObj> free = new LinkedList<>();
    List<PoolObj> used = new LinkedList<>();

    public PoolObj getPoolObj(){
        if(free.isEmpty()){
            PoolObj poolObj = new PoolObj();
            free.add(poolObj);
            return poolObj;
        }
        else{
            PoolObj poolObj = free.get(0);
            used.add(poolObj);
            free.remove(poolObj);
            return poolObj;
        }
    }
    public void realisePoolObject(PoolObj poolObj){
        used.remove(poolObj);
        free.add(poolObj);
    }
}