package com.google.firebase.sessions;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.android.datatransport.TransportFactory;
import com.google.firebase.FirebaseApp;
import com.google.firebase.annotations.concurrent.Background;
import com.google.firebase.annotations.concurrent.Blocking;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import com.google.firebase.components.Qualified;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import com.google.firebase.sessions.settings.SessionsSettings;
import java.util.List;
import kotlin.collections.I;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Keep
public final class FirebaseSessionsRegistrar implements ComponentRegistrar {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private static final String LIBRARY_NAME = "fire-sessions";

    @NotNull
    private static final Qualified<CoroutineDispatcher> backgroundDispatcher;

    @NotNull
    private static final Qualified<CoroutineDispatcher> blockingDispatcher;

    @NotNull
    private static final Qualified<FirebaseApp> firebaseApp;

    @NotNull
    private static final Qualified<FirebaseInstallationsApi> firebaseInstallationsApi;

    @NotNull
    private static final Qualified<SessionLifecycleServiceBinder> sessionLifecycleServiceBinder;

    @NotNull
    private static final Qualified<SessionsSettings> sessionsSettings;

    @NotNull
    private static final Qualified<TransportFactory> transportFactory;

    public static final class Companion {
        public /* synthetic */ Companion(C4969v c4969v) {
            this();
        }

        private Companion() {
        }
    }

    static {
        Qualified<FirebaseApp> qualifiedUnqualified = Qualified.unqualified(FirebaseApp.class);
        G.o(qualifiedUnqualified, "unqualified(FirebaseApp::class.java)");
        firebaseApp = qualifiedUnqualified;
        Qualified<FirebaseInstallationsApi> qualifiedUnqualified2 = Qualified.unqualified(FirebaseInstallationsApi.class);
        G.o(qualifiedUnqualified2, "unqualified(FirebaseInstallationsApi::class.java)");
        firebaseInstallationsApi = qualifiedUnqualified2;
        Qualified<CoroutineDispatcher> qualified = Qualified.qualified(Background.class, CoroutineDispatcher.class);
        G.o(qualified, "qualified(Background::cl…neDispatcher::class.java)");
        backgroundDispatcher = qualified;
        Qualified<CoroutineDispatcher> qualified2 = Qualified.qualified(Blocking.class, CoroutineDispatcher.class);
        G.o(qualified2, "qualified(Blocking::clas…neDispatcher::class.java)");
        blockingDispatcher = qualified2;
        Qualified<TransportFactory> qualifiedUnqualified3 = Qualified.unqualified(TransportFactory.class);
        G.o(qualifiedUnqualified3, "unqualified(TransportFactory::class.java)");
        transportFactory = qualifiedUnqualified3;
        Qualified<SessionsSettings> qualifiedUnqualified4 = Qualified.unqualified(SessionsSettings.class);
        G.o(qualifiedUnqualified4, "unqualified(SessionsSettings::class.java)");
        sessionsSettings = qualifiedUnqualified4;
        Qualified<SessionLifecycleServiceBinder> qualifiedUnqualified5 = Qualified.unqualified(SessionLifecycleServiceBinder.class);
        G.o(qualifiedUnqualified5, "unqualified(SessionLifec…erviceBinder::class.java)");
        sessionLifecycleServiceBinder = qualifiedUnqualified5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FirebaseSessions getComponents$lambda$0(ComponentContainer componentContainer) {
        Object obj = componentContainer.get(firebaseApp);
        G.o(obj, "container[firebaseApp]");
        Object obj2 = componentContainer.get(sessionsSettings);
        G.o(obj2, "container[sessionsSettings]");
        Object obj3 = componentContainer.get(backgroundDispatcher);
        G.o(obj3, "container[backgroundDispatcher]");
        Object obj4 = componentContainer.get(sessionLifecycleServiceBinder);
        G.o(obj4, "container[sessionLifecycleServiceBinder]");
        return new FirebaseSessions((FirebaseApp) obj, (SessionsSettings) obj2, (kotlin.coroutines.i) obj3, (SessionLifecycleServiceBinder) obj4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final SessionGenerator getComponents$lambda$1(ComponentContainer componentContainer) {
        return new SessionGenerator(WallClock.INSTANCE, null, 2, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SessionFirelogPublisher getComponents$lambda$2(ComponentContainer componentContainer) {
        Object obj = componentContainer.get(firebaseApp);
        G.o(obj, "container[firebaseApp]");
        Object obj2 = componentContainer.get(firebaseInstallationsApi);
        G.o(obj2, "container[firebaseInstallationsApi]");
        Object obj3 = componentContainer.get(sessionsSettings);
        G.o(obj3, "container[sessionsSettings]");
        Provider provider = componentContainer.getProvider(transportFactory);
        G.o(provider, "container.getProvider(transportFactory)");
        EventGDTLogger eventGDTLogger = new EventGDTLogger(provider);
        Object obj4 = componentContainer.get(backgroundDispatcher);
        G.o(obj4, "container[backgroundDispatcher]");
        return new SessionFirelogPublisherImpl((FirebaseApp) obj, (FirebaseInstallationsApi) obj2, (SessionsSettings) obj3, eventGDTLogger, (kotlin.coroutines.i) obj4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SessionsSettings getComponents$lambda$3(ComponentContainer componentContainer) {
        Object obj = componentContainer.get(firebaseApp);
        G.o(obj, "container[firebaseApp]");
        Object obj2 = componentContainer.get(blockingDispatcher);
        G.o(obj2, "container[blockingDispatcher]");
        Object obj3 = componentContainer.get(backgroundDispatcher);
        G.o(obj3, "container[backgroundDispatcher]");
        Object obj4 = componentContainer.get(firebaseInstallationsApi);
        G.o(obj4, "container[firebaseInstallationsApi]");
        return new SessionsSettings((FirebaseApp) obj, (kotlin.coroutines.i) obj2, (kotlin.coroutines.i) obj3, (FirebaseInstallationsApi) obj4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SessionDatastore getComponents$lambda$4(ComponentContainer componentContainer) {
        Context applicationContext = ((FirebaseApp) componentContainer.get(firebaseApp)).getApplicationContext();
        G.o(applicationContext, "container[firebaseApp].applicationContext");
        Object obj = componentContainer.get(backgroundDispatcher);
        G.o(obj, "container[backgroundDispatcher]");
        return new SessionDatastoreImpl(applicationContext, (kotlin.coroutines.i) obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SessionLifecycleServiceBinder getComponents$lambda$5(ComponentContainer componentContainer) {
        Object obj = componentContainer.get(firebaseApp);
        G.o(obj, "container[firebaseApp]");
        return new SessionLifecycleServiceBinderImpl((FirebaseApp) obj);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @NotNull
    public List<Component<? extends Object>> getComponents() {
        Component.Builder builderName = Component.builder(FirebaseSessions.class).name(LIBRARY_NAME);
        Qualified<FirebaseApp> qualified = firebaseApp;
        Component.Builder builderAdd = builderName.add(Dependency.required(qualified));
        Qualified<SessionsSettings> qualified2 = sessionsSettings;
        Component.Builder builderAdd2 = builderAdd.add(Dependency.required(qualified2));
        Qualified<CoroutineDispatcher> qualified3 = backgroundDispatcher;
        Component componentBuild = builderAdd2.add(Dependency.required(qualified3)).add(Dependency.required(sessionLifecycleServiceBinder)).factory(new c()).eagerInDefaultApp().build();
        Component componentBuild2 = Component.builder(SessionGenerator.class).name("session-generator").factory(new d()).build();
        Component.Builder builderAdd3 = Component.builder(SessionFirelogPublisher.class).name("session-publisher").add(Dependency.required(qualified));
        Qualified<FirebaseInstallationsApi> qualified4 = firebaseInstallationsApi;
        return I.Q(componentBuild, componentBuild2, builderAdd3.add(Dependency.required(qualified4)).add(Dependency.required(qualified2)).add(Dependency.requiredProvider(transportFactory)).add(Dependency.required(qualified3)).factory(new e()).build(), Component.builder(SessionsSettings.class).name("sessions-settings").add(Dependency.required(qualified)).add(Dependency.required(blockingDispatcher)).add(Dependency.required(qualified3)).add(Dependency.required(qualified4)).factory(new f()).build(), Component.builder(SessionDatastore.class).name("sessions-datastore").add(Dependency.required(qualified)).add(Dependency.required(qualified3)).factory(new g()).build(), Component.builder(SessionLifecycleServiceBinder.class).name("sessions-service-binder").add(Dependency.required(qualified)).factory(new h()).build(), LibraryVersionComponent.create(LIBRARY_NAME, BuildConfig.VERSION_NAME));
    }
}
