/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Examenes;

/**
 *
 * @author ppier
 */
interface IService {
    String CallService(String url);
}

class Service implements IService {

    @Override
    public String CallService(String url) {
        System.out.println("Se hace el consumo al servicio: " + url);
        return null;
    }
}

class controller {
    private IService _iService;
    public controller(IService iService){
     this._iService = iService;
    }
    
    public void ejecutarServicio() {
        this._iService.CallService("https://google.com");
    }
}

public class Examen_02_01 {

    public static void main(String[] args) {
        Service service = new Service();
        controller ctr = new controller(service);
        ctr.ejecutarServicio();
    }
}
