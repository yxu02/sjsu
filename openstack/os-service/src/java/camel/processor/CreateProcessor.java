package camel.processor;

import camel.JsonHelper;
import vm.OpenstackController;

/***
 *Created by Lin Cheng
 */
public class CreateProcessor extends GetProcessor {
    @Override
    String handle() {

        switch (paramMap.get("type")){
            case "server":
                return JsonHelper.toJson(OpenstackController.instance().createServer(paramMap.get("name"),
                        paramMap.get("flavor"), paramMap.get("image"), paramMap.get("network")));
            default:
                return JsonHelper.toJson("Not supported.");
        }
    }
}
