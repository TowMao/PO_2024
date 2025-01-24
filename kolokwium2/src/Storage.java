public class Storage <T>{
    T object;

    public Storage(){
        this.object = null;
    }

    public void store(T item){
        this.object = item;
    }

    public T retrieve(){
        if(this.object != null){
            return this.object;
        }
        return null;
    }
}
