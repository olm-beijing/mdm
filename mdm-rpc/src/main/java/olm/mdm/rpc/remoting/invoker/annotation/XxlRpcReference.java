package olm.mdm.rpc.remoting.invoker.annotation;

import olm.mdm.rpc.remoting.invoker.call.CallType;
import olm.mdm.rpc.remoting.invoker.route.LoadBalance;
import olm.mdm.rpc.remoting.net.Client;
import olm.mdm.rpc.remoting.net.impl.netty.client.NettyClient;
import olm.mdm.rpc.serialize.Serializer;
import olm.mdm.rpc.serialize.impl.HessianSerializer;

import java.lang.annotation.*;

/**
 * rpc service annotation, skeleton of stub ("@Inherited" allow service use "Transactional")
 *
 * @author 2015-10-29 19:44:33
 */
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface XxlRpcReference {

    Class<? extends Client> client() default NettyClient.class;

    Class<? extends Serializer> serializer() default HessianSerializer.class;

    CallType callType() default CallType.SYNC;

    LoadBalance loadBalance() default LoadBalance.ROUND;

    //Class<?> iface;
    String version() default "";

    long timeout() default 1000;

    String address() default "";

    String accessToken() default "";

    //XxlRpcInvokeCallback invokeCallback() ;

}
