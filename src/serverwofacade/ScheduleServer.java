/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package serverwofacade;

/**
 *
 * @author sarun
 */
public class ScheduleServer {
    public String startBooting(){
	return "Starts booting...";
    }
    public String readSystemConfigFile(){
    return "Reading system config files...";
    }
    public String init(){
	return "Initializing...";
    }
    public String initializeContext(){
	return "Initializing context...";
    }
    public String initializeListeners(){
	return "Initializing listeners...";
    }
    public String createSystemObjects(){
    return "Creating system objects...";
    }
    public String releaseProcesses(){
    return "Releasing processes...";
    }
    public String destory(){
    return "Destorying...";
    }
    public String destroySystemObjects(){
	return "Destroying system objects...";
    }
    public String destoryListeners(){
    return "Destroying listeners...";
    }
    public String destoryContext(){
    return "Destroying context...";
    }
    public String shutdown(){
    return "Shutting down...";
    }
}
