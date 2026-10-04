package com.unity3d.services.core.di;

import com.unity3d.services.SDKErrorHandler;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.domain.SDKDispatchers;
import com.unity3d.services.core.domain.task.InitializeSDK;
import com.unity3d.services.core.domain.task.InitializeStateComplete;
import com.unity3d.services.core.domain.task.InitializeStateConfig;
import com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader;
import com.unity3d.services.core.domain.task.InitializeStateCreate;
import com.unity3d.services.core.domain.task.InitializeStateCreateWithRemote;
import com.unity3d.services.core.domain.task.InitializeStateError;
import com.unity3d.services.core.domain.task.InitializeStateInitModules;
import com.unity3d.services.core.domain.task.InitializeStateLoadCache;
import com.unity3d.services.core.domain.task.InitializeStateLoadConfigFile;
import com.unity3d.services.core.domain.task.InitializeStateLoadWeb;
import com.unity3d.services.core.domain.task.InitializeStateNetworkError;
import com.unity3d.services.core.domain.task.InitializeStateReset;
import ed.InterfaceC4376a;
import ed.l;
import kotlin.I;
import kotlin.L0;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.O;
import kotlin.jvm.internal.P;
import kotlinx.coroutines.H;
import kotlinx.coroutines.L;
import kotlinx.coroutines.M;
import kotlinx.coroutines.Y0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class ServiceProvider implements IServiceProvider {

    @NotNull
    public static final ServiceProvider INSTANCE;

    @NotNull
    public static final String NAMED_SDK = "sdk";
    private static final IServicesRegistry serviceRegistry;

    static {
        ServiceProvider serviceProvider = new ServiceProvider();
        INSTANCE = serviceProvider;
        serviceRegistry = serviceProvider.initialize();
    }

    private ServiceProvider() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ISDKDispatchers provideSDKDispatchers() {
        return new SDKDispatchers();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final H provideSDKErrorHandler(ISDKDispatchers iSDKDispatchers) {
        return new SDKErrorHandler(iSDKDispatchers);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final L provideSDKScope(ISDKDispatchers iSDKDispatchers, H h10) {
        return M.a(iSDKDispatchers.getDefault().plus(Y0.c(null, 1, null)).plus(h10));
    }

    @Override // com.unity3d.services.core.di.IServiceProvider
    @NotNull
    public IServicesRegistry getRegistry() {
        return serviceRegistry;
    }

    @Override // com.unity3d.services.core.di.IServiceProvider
    @NotNull
    public IServicesRegistry initialize() {
        return ServicesRegistryKt.registry(new l<ServicesRegistry, L0>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1
            @Override // ed.l
            public /* bridge */ /* synthetic */ L0 invoke(ServicesRegistry servicesRegistry) {
                invoke2(servicesRegistry);
                return L0.f217464a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull final ServicesRegistry receiver) {
                G.p(receiver, "$receiver");
                receiver.updateService(new ServiceKey("", O.d(ISDKDispatchers.class)), I.a(new InterfaceC4376a<ISDKDispatchers>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // ed.InterfaceC4376a
                    @NotNull
                    public final ISDKDispatchers invoke() {
                        return ServiceProvider.INSTANCE.provideSDKDispatchers();
                    }
                }));
                InterfaceC4376a<H> interfaceC4376a = new InterfaceC4376a<H>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.2
                    {
                        super(0);
                    }

                    @Override // ed.InterfaceC4376a
                    @NotNull
                    public final H invoke() {
                        return ServiceProvider.INSTANCE.provideSDKErrorHandler((ISDKDispatchers) receiver.resolveService(new ServiceKey("", O.d(ISDKDispatchers.class))));
                    }
                };
                P p10 = O.f217893a;
                receiver.updateService(new ServiceKey(ServiceProvider.NAMED_SDK, p10.d(H.class)), I.a(interfaceC4376a));
                receiver.updateService(new ServiceKey(ServiceProvider.NAMED_SDK, p10.d(L.class)), I.a(new InterfaceC4376a<L>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.3
                    {
                        super(0);
                    }

                    @Override // ed.InterfaceC4376a
                    @NotNull
                    public final L invoke() {
                        return ServiceProvider.INSTANCE.provideSDKScope((ISDKDispatchers) receiver.resolveService(new ServiceKey("", O.d(ISDKDispatchers.class))), (H) receiver.resolveService(new ServiceKey(ServiceProvider.NAMED_SDK, O.f217893a.d(H.class))));
                    }
                }));
                receiver.updateService(new ServiceKey("", p10.d(InitializeStateNetworkError.class)), ServiceFactoryKt.factoryOf(new InterfaceC4376a<InitializeStateNetworkError>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.4
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // ed.InterfaceC4376a
                    @NotNull
                    public final InitializeStateNetworkError invoke() {
                        return new InitializeStateNetworkError((ISDKDispatchers) receiver.resolveService(new ServiceKey("", O.d(ISDKDispatchers.class))));
                    }
                }));
                receiver.updateService(new ServiceKey("", p10.d(InitializeStateLoadConfigFile.class)), I.a(new InterfaceC4376a<InitializeStateLoadConfigFile>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.5
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // ed.InterfaceC4376a
                    @NotNull
                    public final InitializeStateLoadConfigFile invoke() {
                        return new InitializeStateLoadConfigFile((ISDKDispatchers) receiver.resolveService(new ServiceKey("", O.d(ISDKDispatchers.class))));
                    }
                }));
                receiver.updateService(new ServiceKey("", p10.d(InitializeStateReset.class)), I.a(new InterfaceC4376a<InitializeStateReset>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.6
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // ed.InterfaceC4376a
                    @NotNull
                    public final InitializeStateReset invoke() {
                        return new InitializeStateReset((ISDKDispatchers) receiver.resolveService(new ServiceKey("", O.d(ISDKDispatchers.class))));
                    }
                }));
                receiver.updateService(new ServiceKey("", p10.d(InitializeStateError.class)), I.a(new InterfaceC4376a<InitializeStateError>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.7
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // ed.InterfaceC4376a
                    @NotNull
                    public final InitializeStateError invoke() {
                        return new InitializeStateError((ISDKDispatchers) receiver.resolveService(new ServiceKey("", O.d(ISDKDispatchers.class))));
                    }
                }));
                receiver.updateService(new ServiceKey("", p10.d(InitializeStateInitModules.class)), I.a(new InterfaceC4376a<InitializeStateInitModules>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.8
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // ed.InterfaceC4376a
                    @NotNull
                    public final InitializeStateInitModules invoke() {
                        return new InitializeStateInitModules((ISDKDispatchers) receiver.resolveService(new ServiceKey("", O.d(ISDKDispatchers.class))));
                    }
                }));
                receiver.updateService(new ServiceKey("", p10.d(InitializeStateConfigWithLoader.class)), I.a(new InterfaceC4376a<InitializeStateConfigWithLoader>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.9
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // ed.InterfaceC4376a
                    @NotNull
                    public final InitializeStateConfigWithLoader invoke() {
                        return new InitializeStateConfigWithLoader((ISDKDispatchers) receiver.resolveService(new ServiceKey("", O.d(ISDKDispatchers.class))), (InitializeStateNetworkError) receiver.resolveService(new ServiceKey("", O.f217893a.d(InitializeStateNetworkError.class))));
                    }
                }));
                receiver.updateService(new ServiceKey("", p10.d(InitializeStateConfig.class)), I.a(new InterfaceC4376a<InitializeStateConfig>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.10
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // ed.InterfaceC4376a
                    @NotNull
                    public final InitializeStateConfig invoke() {
                        return new InitializeStateConfig((ISDKDispatchers) receiver.resolveService(new ServiceKey("", O.d(ISDKDispatchers.class))), (InitializeStateConfigWithLoader) receiver.resolveService(new ServiceKey("", O.f217893a.d(InitializeStateConfigWithLoader.class))));
                    }
                }));
                receiver.updateService(new ServiceKey("", p10.d(InitializeStateCreate.class)), I.a(new InterfaceC4376a<InitializeStateCreate>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.11
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // ed.InterfaceC4376a
                    @NotNull
                    public final InitializeStateCreate invoke() {
                        return new InitializeStateCreate((ISDKDispatchers) receiver.resolveService(new ServiceKey("", O.d(ISDKDispatchers.class))));
                    }
                }));
                receiver.updateService(new ServiceKey("", p10.d(InitializeStateLoadCache.class)), I.a(new InterfaceC4376a<InitializeStateLoadCache>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.12
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // ed.InterfaceC4376a
                    @NotNull
                    public final InitializeStateLoadCache invoke() {
                        return new InitializeStateLoadCache((ISDKDispatchers) receiver.resolveService(new ServiceKey("", O.d(ISDKDispatchers.class))));
                    }
                }));
                receiver.updateService(new ServiceKey("", p10.d(InitializeStateCreateWithRemote.class)), I.a(new InterfaceC4376a<InitializeStateCreateWithRemote>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.13
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // ed.InterfaceC4376a
                    @NotNull
                    public final InitializeStateCreateWithRemote invoke() {
                        return new InitializeStateCreateWithRemote((ISDKDispatchers) receiver.resolveService(new ServiceKey("", O.d(ISDKDispatchers.class))));
                    }
                }));
                receiver.updateService(new ServiceKey("", p10.d(InitializeStateLoadWeb.class)), I.a(new InterfaceC4376a<InitializeStateLoadWeb>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.14
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // ed.InterfaceC4376a
                    @NotNull
                    public final InitializeStateLoadWeb invoke() {
                        return new InitializeStateLoadWeb((ISDKDispatchers) receiver.resolveService(new ServiceKey("", O.d(ISDKDispatchers.class))), (InitializeStateNetworkError) receiver.resolveService(new ServiceKey("", O.f217893a.d(InitializeStateNetworkError.class))));
                    }
                }));
                receiver.updateService(new ServiceKey("", p10.d(InitializeStateComplete.class)), I.a(new InterfaceC4376a<InitializeStateComplete>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.15
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // ed.InterfaceC4376a
                    @NotNull
                    public final InitializeStateComplete invoke() {
                        return new InitializeStateComplete((ISDKDispatchers) receiver.resolveService(new ServiceKey("", O.d(ISDKDispatchers.class))));
                    }
                }));
                receiver.updateService(new ServiceKey("", p10.d(InitializeSDK.class)), I.a(new InterfaceC4376a<InitializeSDK>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.16
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // ed.InterfaceC4376a
                    @NotNull
                    public final InitializeSDK invoke() {
                        ISDKDispatchers iSDKDispatchers = (ISDKDispatchers) receiver.resolveService(new ServiceKey("", O.d(ISDKDispatchers.class)));
                        ServicesRegistry servicesRegistry = receiver;
                        P p11 = O.f217893a;
                        return new InitializeSDK(iSDKDispatchers, (InitializeStateLoadConfigFile) servicesRegistry.resolveService(new ServiceKey("", p11.d(InitializeStateLoadConfigFile.class))), (InitializeStateReset) receiver.resolveService(new ServiceKey("", p11.d(InitializeStateReset.class))), (InitializeStateError) receiver.resolveService(new ServiceKey("", p11.d(InitializeStateError.class))), (InitializeStateInitModules) receiver.resolveService(new ServiceKey("", p11.d(InitializeStateInitModules.class))), (InitializeStateConfig) receiver.resolveService(new ServiceKey("", p11.d(InitializeStateConfig.class))), (InitializeStateCreate) receiver.resolveService(new ServiceKey("", p11.d(InitializeStateCreate.class))), (InitializeStateLoadCache) receiver.resolveService(new ServiceKey("", p11.d(InitializeStateLoadCache.class))), (InitializeStateCreateWithRemote) receiver.resolveService(new ServiceKey("", p11.d(InitializeStateCreateWithRemote.class))), (InitializeStateLoadWeb) receiver.resolveService(new ServiceKey("", p11.d(InitializeStateLoadWeb.class))), (InitializeStateComplete) receiver.resolveService(new ServiceKey("", p11.d(InitializeStateComplete.class))));
                    }
                }));
            }
        });
    }
}
