package com.google.firebase.sessions;

import android.util.Log;
import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.Event;
import com.google.android.datatransport.Transformer;
import com.google.android.datatransport.TransportFactory;
import com.google.firebase.inject.Provider;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import kotlin.text.C5013e;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class EventGDTLogger implements EventGDTLoggerInterface {

    @NotNull
    private static final String AQS_LOG_SOURCE = "FIREBASE_APPQUALITY_SESSION";

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final String TAG = "EventGDTLogger";

    @NotNull
    private final Provider<TransportFactory> transportFactoryProvider;

    public static final class Companion {
        public /* synthetic */ Companion(C4969v c4969v) {
            this();
        }

        private Companion() {
        }
    }

    public EventGDTLogger(@NotNull Provider<TransportFactory> transportFactoryProvider) {
        G.p(transportFactoryProvider, "transportFactoryProvider");
        this.transportFactoryProvider = transportFactoryProvider;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final byte[] encode(SessionEvent sessionEvent) {
        String strEncode = SessionEvents.INSTANCE.getSESSION_EVENT_ENCODER$com_google_firebase_firebase_sessions().encode(sessionEvent);
        G.o(strEncode, "SessionEvents.SESSION_EVENT_ENCODER.encode(value)");
        Log.d(TAG, "Session Event: ".concat(strEncode));
        byte[] bytes = strEncode.getBytes(C5013e.f218326b);
        G.o(bytes, "this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    @Override // com.google.firebase.sessions.EventGDTLoggerInterface
    public void log(@NotNull SessionEvent sessionEvent) {
        G.p(sessionEvent, "sessionEvent");
        this.transportFactoryProvider.get().getTransport(AQS_LOG_SOURCE, SessionEvent.class, Encoding.of("json"), new Transformer() { // from class: com.google.firebase.sessions.a
            @Override // com.google.android.datatransport.Transformer
            public final Object apply(Object obj) {
                return this.f151266a.encode((SessionEvent) obj);
            }
        }).send(Event.ofData(sessionEvent));
    }
}
