package gear.yc.com.gearapplication.network;

import com.gear.apifinder.annotation.APIManager;
import com.gear.apifinder.annotation.APIRouter;

import gear.yc.com.gearlibrary.network.api.GearHttpServiceManager;

/**
 * GearApplication
 * Created by YichenZ on 2017/1/18 17:01.
 */
@APIManager
@APIRouter(value = "DEMO")
public class HttpServiceManager extends GearHttpServiceManager {
}
