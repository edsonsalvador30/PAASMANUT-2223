package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;

@CronapiMetaData(type = "blockly")
@CronappSecurity
public class BlocoServ {

	public static final int TIMEOUT = 300;

/**
 *
 * @return Var
 */
// Bloco-Serv
public static Var Executar() throws Exception {
 return new Callable<Var>() {

   public Var call() throws Exception {
    cronapi.util.Operations.callClientFunction( Var.valueOf("cronapi.screen.notify"), Var.valueOf("warning"), Var.valueOf("Disparado no Servidor"));
    cronapi.util.Operations.callClientFunction(Var.valueOf("blockly.js.blockly.BlocoCli.Executar"),);
    return Var.VAR_NULL;
   }
 }.call();
}

}
