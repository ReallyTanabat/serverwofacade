package serverwofacade;
public class Facade {
    public static Facade FacadeObj = null;
        public Facade() {}
        public static Facade getFacadeObj() {
            if(FacadeObj == null){
                FacadeObj = new Facade();
            }
            return FacadeObj;
        }

        public String ServerClass(){
            ScheduleServer obj = new ScheduleServer();
            String j = obj.startBooting() + "\n" + obj.readSystemConfigFile() + "\n" + obj.init()+ "\n" + obj.initializeContext()+ "\n"+obj.initializeListeners()+ "\n"+obj.createSystemObjects()+ "\n"+obj.releaseProcesses()+ "\n"+obj.destory()+ "\n"+obj.destroySystemObjects()+ "\n"+obj.destoryListeners()+ "\n"+obj.destoryContext()+ "\n"+obj.shutdown();
            return j;
        }
}
