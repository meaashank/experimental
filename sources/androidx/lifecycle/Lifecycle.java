package androidx.lifecycle;

import androidx.annotation.RestrictTo;
import androidx.lifecycle.Lifecycle;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.C4969v;
import kotlinx.coroutines.flow.FlowKt__ShareKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@kotlin.jvm.internal.V({"SMAP\nLifecycle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Lifecycle.kt\nandroidx/lifecycle/Lifecycle\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,390:1\n1#2:391\n*E\n"})
public abstract class Lifecycle {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    public AtomicReference<Object> f114029a = new AtomicReference<>(null);

    public enum Event {
        ON_CREATE,
        ON_START,
        ON_RESUME,
        ON_PAUSE,
        ON_STOP,
        ON_DESTROY,
        ON_ANY;


        @NotNull
        public static final a Companion = new a();

        public static final class a {

            /* JADX INFO: renamed from: androidx.lifecycle.Lifecycle$Event$a$a, reason: collision with other inner class name */
            public /* synthetic */ class C0301a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f114030a;

                static {
                    int[] iArr = new int[State.values().length];
                    try {
                        iArr[State.CREATED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[State.STARTED.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[State.RESUMED.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[State.DESTROYED.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[State.INITIALIZED.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    f114030a = iArr;
                }
            }

            public a() {
            }

            @dd.o
            @Nullable
            public final Event a(@NotNull State state) {
                kotlin.jvm.internal.G.p(state, "state");
                int i10 = C0301a.f114030a[state.ordinal()];
                if (i10 == 1) {
                    return Event.ON_DESTROY;
                }
                if (i10 == 2) {
                    return Event.ON_STOP;
                }
                if (i10 != 3) {
                    return null;
                }
                return Event.ON_PAUSE;
            }

            @dd.o
            @Nullable
            public final Event b(@NotNull State state) {
                kotlin.jvm.internal.G.p(state, "state");
                int i10 = C0301a.f114030a[state.ordinal()];
                if (i10 == 1) {
                    return Event.ON_STOP;
                }
                if (i10 == 2) {
                    return Event.ON_PAUSE;
                }
                if (i10 != 4) {
                    return null;
                }
                return Event.ON_DESTROY;
            }

            @dd.o
            @Nullable
            public final Event c(@NotNull State state) {
                kotlin.jvm.internal.G.p(state, "state");
                int i10 = C0301a.f114030a[state.ordinal()];
                if (i10 == 1) {
                    return Event.ON_START;
                }
                if (i10 == 2) {
                    return Event.ON_RESUME;
                }
                if (i10 != 5) {
                    return null;
                }
                return Event.ON_CREATE;
            }

            @dd.o
            @Nullable
            public final Event d(@NotNull State state) {
                kotlin.jvm.internal.G.p(state, "state");
                int i10 = C0301a.f114030a[state.ordinal()];
                if (i10 == 1) {
                    return Event.ON_CREATE;
                }
                if (i10 == 2) {
                    return Event.ON_START;
                }
                if (i10 != 3) {
                    return null;
                }
                return Event.ON_RESUME;
            }

            public a(C4969v c4969v) {
            }
        }

        public /* synthetic */ class b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f114031a;

            static {
                int[] iArr = new int[Event.values().length];
                try {
                    iArr[Event.ON_CREATE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Event.ON_STOP.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[Event.ON_START.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[Event.ON_PAUSE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[Event.ON_RESUME.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[Event.ON_DESTROY.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[Event.ON_ANY.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                f114031a = iArr;
            }
        }

        @dd.o
        @Nullable
        public static final Event downFrom(@NotNull State state) {
            return Companion.a(state);
        }

        @dd.o
        @Nullable
        public static final Event downTo(@NotNull State state) {
            return Companion.b(state);
        }

        @dd.o
        @Nullable
        public static final Event upFrom(@NotNull State state) {
            return Companion.c(state);
        }

        @dd.o
        @Nullable
        public static final Event upTo(@NotNull State state) {
            return Companion.d(state);
        }

        @NotNull
        public final State getTargetState() {
            switch (b.f114031a[ordinal()]) {
                case 1:
                case 2:
                    return State.CREATED;
                case 3:
                case 4:
                    return State.STARTED;
                case 5:
                    return State.RESUMED;
                case 6:
                    return State.DESTROYED;
                default:
                    throw new IllegalArgumentException(this + " has no target state");
            }
        }
    }

    public enum State {
        DESTROYED,
        INITIALIZED,
        CREATED,
        STARTED,
        RESUMED;

        public final boolean isAtLeast(@NotNull State state) {
            kotlin.jvm.internal.G.p(state, "state");
            return compareTo(state) >= 0;
        }
    }

    public static final void b(kotlinx.coroutines.flow.j mutableStateFlow, B b10, Event event) {
        kotlin.jvm.internal.G.p(mutableStateFlow, "$mutableStateFlow");
        kotlin.jvm.internal.G.p(b10, "<anonymous parameter 0>");
        kotlin.jvm.internal.G.p(event, "event");
        mutableStateFlow.setValue(event.getTargetState());
    }

    @e.I
    public abstract void c(@NotNull A a10);

    @e.I
    @NotNull
    public abstract State d();

    @NotNull
    public kotlinx.coroutines.flow.u<State> e() {
        final kotlinx.coroutines.flow.j jVarA = kotlinx.coroutines.flow.v.a(d());
        c(new InterfaceC2611y() { // from class: androidx.lifecycle.u
            @Override // androidx.lifecycle.InterfaceC2611y
            public final void onStateChanged(B b10, Lifecycle.Event event) {
                Lifecycle.b(jVarA, b10, event);
            }
        });
        return FlowKt__ShareKt.b(jVarA);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    public final AtomicReference<Object> f() {
        return this.f114029a;
    }

    @e.I
    public abstract void g(@NotNull A a10);

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void h(@NotNull AtomicReference<Object> atomicReference) {
        kotlin.jvm.internal.G.p(atomicReference, "<set-?>");
        this.f114029a = atomicReference;
    }
}
