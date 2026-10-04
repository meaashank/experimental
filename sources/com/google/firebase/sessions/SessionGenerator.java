package com.google.firebase.sessions;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.firebase.Firebase;
import com.google.firebase.FirebaseKt;
import ed.InterfaceC4376a;
import java.util.Locale;
import java.util.UUID;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.G;
import kotlin.text.F;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class SessionGenerator {

    @NotNull
    public static final Companion Companion = new Companion(null);
    private SessionDetails currentSession;

    @NotNull
    private final String firstSessionId;
    private int sessionIndex;

    @NotNull
    private final TimeProvider timeProvider;

    @NotNull
    private final InterfaceC4376a<UUID> uuidGenerator;

    /* JADX INFO: renamed from: com.google.firebase.sessions.SessionGenerator$1, reason: invalid class name */
    public /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements InterfaceC4376a<UUID> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(0, UUID.class, "randomUUID", "randomUUID()Ljava/util/UUID;", 0);
        }

        @Override // ed.InterfaceC4376a
        public final UUID invoke() {
            return UUID.randomUUID();
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(C4969v c4969v) {
            this();
        }

        @NotNull
        public final SessionGenerator getInstance() {
            Object obj = FirebaseKt.getApp(Firebase.INSTANCE).get(SessionGenerator.class);
            G.o(obj, "Firebase.app[SessionGenerator::class.java]");
            return (SessionGenerator) obj;
        }

        private Companion() {
        }
    }

    public SessionGenerator(@NotNull TimeProvider timeProvider, @NotNull InterfaceC4376a<UUID> uuidGenerator) {
        G.p(timeProvider, "timeProvider");
        G.p(uuidGenerator, "uuidGenerator");
        this.timeProvider = timeProvider;
        this.uuidGenerator = uuidGenerator;
        this.firstSessionId = generateSessionId();
        this.sessionIndex = -1;
    }

    private final String generateSessionId() {
        String string = this.uuidGenerator.invoke().toString();
        G.o(string, "uuidGenerator().toString()");
        String lowerCase = F.B2(string, com.prism.gaia.download.a.f164606q, "", false, 4, null).toLowerCase(Locale.ROOT);
        G.o(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return lowerCase;
    }

    @CanIgnoreReturnValue
    @NotNull
    public final SessionDetails generateNewSession() {
        int i10 = this.sessionIndex + 1;
        this.sessionIndex = i10;
        this.currentSession = new SessionDetails(i10 == 0 ? this.firstSessionId : generateSessionId(), this.firstSessionId, this.sessionIndex, this.timeProvider.currentTimeUs());
        return getCurrentSession();
    }

    @NotNull
    public final SessionDetails getCurrentSession() {
        SessionDetails sessionDetails = this.currentSession;
        if (sessionDetails != null) {
            return sessionDetails;
        }
        G.S("currentSession");
        throw null;
    }

    public final boolean getHasGenerateSession() {
        return this.currentSession != null;
    }

    public /* synthetic */ SessionGenerator(TimeProvider timeProvider, InterfaceC4376a interfaceC4376a, int i10, C4969v c4969v) {
        this(timeProvider, (i10 & 2) != 0 ? AnonymousClass1.INSTANCE : interfaceC4376a);
    }
}
