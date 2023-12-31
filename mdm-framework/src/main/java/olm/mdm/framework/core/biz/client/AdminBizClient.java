package olm.mdm.framework.core.biz.client;


import olm.mdm.framework.core.biz.AdminBiz;
import olm.mdm.framework.core.biz.model.HandleCallbackParam;
import olm.mdm.framework.core.biz.model.HandleProcessCallbackParam;
import olm.mdm.framework.core.biz.model.RegistryParam;
import olm.mdm.framework.core.biz.model.ReturnT;
import olm.mdm.framework.util.JobRemotingUtil;

import java.util.List;

/**
 * admin api test
 *
 * @author xuxueli 2017-07-28 22:14:52
 */
public class AdminBizClient implements AdminBiz {

    public AdminBizClient() {
    }
    public AdminBizClient(String addressUrl, String accessToken) {
        this.addressUrl = addressUrl;
        this.accessToken = accessToken;

        // valid
        if (!this.addressUrl.endsWith("/")) {
            this.addressUrl = this.addressUrl + "/";
        }
    }

    private String addressUrl ;
    private String accessToken;


    @Override
    public ReturnT<String> callback(List<HandleCallbackParam> callbackParamList) {
        return JobRemotingUtil.postBody(addressUrl+"dev-api/jobApi/callback", accessToken, callbackParamList, 3);
    }

    @Override
    public ReturnT<String> processCallback(List<HandleProcessCallbackParam> callbackParamList) {
        return JobRemotingUtil.postBody(addressUrl + "dev-api/jobApi/processCallback", accessToken, callbackParamList, 3);
    }

    @Override
    public ReturnT<String> registry(RegistryParam registryParam) {
        return JobRemotingUtil.postBody(addressUrl + "dev-api/jobApi/registry", accessToken, registryParam, 30);
    }

    @Override
    public ReturnT<String> registryRemove(RegistryParam registryParam) {
        return JobRemotingUtil.postBody(addressUrl + "dev-api/jobApi/registryRemove", accessToken, registryParam, 3);
    }
}
