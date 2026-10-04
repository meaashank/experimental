package com.prism.gaia.naked.metadata.android.location;

import W6.c;
import W6.l;
import W6.m;
import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import com.prism.gaia.naked.core.InitOnce;
import com.prism.gaia.naked.core.InitOnceClass;
import com.prism.gaia.naked.core.InitOnceClassTry;
import com.prism.gaia.naked.core.InitOnceTry;
import com.prism.gaia.naked.entity.NakedMethod;
import com.prism.gaia.naked.entity.NakedObject;
import com.prism.gaia.naked.metadata.android.location.LocationManagerCAGI;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
@c
public final class LocationManagerCAG {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static Impl_G f165821G = new Impl_G();

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static Impl_D f165820D = new Impl_D();

    public static final class Impl_D implements LocationManagerCAGI.D {
        public Impl_OPPO_R815T OPPO_R815T = new Impl_OPPO_R815T();
        public Impl_SumsungS5 SumsungS5 = new Impl_SumsungS5();
        public Impl_VIVO VIVO = new Impl_VIVO();

        public static final class Impl_OPPO_R815T implements LocationManagerCAGI.D.OPPO_R815T {

            /* JADX INFO: renamed from: C, reason: collision with root package name */
            public Impl_C f165822C = new Impl_C();

            public static final class Impl_C implements LocationManagerCAGI.D.OPPO_R815T.C {
                public Impl_GpsStatusListenerTransport GpsStatusListenerTransport = new Impl_GpsStatusListenerTransport();

                @m
                public static final class Impl_GpsStatusListenerTransport implements LocationManagerCAGI.D.OPPO_R815T.C.GpsStatusListenerTransport {
                    private InitOnceClassTry __ORG_CLASS = new InitOnceClassTry("android.location.LocationManager$GpsStatusListenerTransport");
                    private InitOnceTry<NakedMethod<Void>> __onSvStatusChanged = new InitOnceTry<>(new InitOnce.Init() { // from class: V8.d
                        @Override // com.prism.gaia.naked.core.InitOnce.Init
                        public final Object onInit() {
                            return this.f76373a.lambda$new$0();
                        }
                    });

                    /* JADX INFO: Access modifiers changed from: private */
                    public /* synthetic */ NakedMethod lambda$new$0() throws Exception {
                        Class clsORG_CLASS = ORG_CLASS();
                        Class cls = Integer.TYPE;
                        return new NakedMethod((Class<?>) clsORG_CLASS, "onSvStatusChanged", (Class<?>[]) new Class[]{cls, int[].class, float[].class, float[].class, float[].class, int[].class, int[].class, int[].class, cls});
                    }

                    @Override // com.prism.gaia.naked.core.ClassAccessor
                    public Class ORG_CLASS() {
                        return this.__ORG_CLASS.get();
                    }

                    @Override // com.prism.gaia.naked.metadata.android.location.LocationManagerCAGI.D.OPPO_R815T.C.GpsStatusListenerTransport
                    public NakedMethod<Void> onSvStatusChanged() {
                        return this.__onSvStatusChanged.get();
                    }
                }
            }
        }

        public static final class Impl_SumsungS5 implements LocationManagerCAGI.D.SumsungS5 {

            /* JADX INFO: renamed from: C, reason: collision with root package name */
            public Impl_C f165823C = new Impl_C();

            public static final class Impl_C implements LocationManagerCAGI.D.SumsungS5.C {
                public Impl_GpsStatusListenerTransport GpsStatusListenerTransport = new Impl_GpsStatusListenerTransport();

                @m
                public static final class Impl_GpsStatusListenerTransport implements LocationManagerCAGI.D.SumsungS5.C.GpsStatusListenerTransport {
                    private InitOnceClassTry __ORG_CLASS = new InitOnceClassTry("android.location.LocationManager$GpsStatusListenerTransport");
                    private InitOnceTry<NakedMethod<Void>> __onSvStatusChanged = new InitOnceTry<>(new InitOnce.Init() { // from class: V8.e
                        @Override // com.prism.gaia.naked.core.InitOnce.Init
                        public final Object onInit() {
                            return this.f76374a.lambda$new$0();
                        }
                    });

                    /* JADX INFO: Access modifiers changed from: private */
                    public /* synthetic */ NakedMethod lambda$new$0() throws Exception {
                        Class clsORG_CLASS = ORG_CLASS();
                        Class cls = Integer.TYPE;
                        return new NakedMethod((Class<?>) clsORG_CLASS, "onSvStatusChanged", (Class<?>[]) new Class[]{cls, int[].class, float[].class, float[].class, float[].class, cls, cls, cls, int[].class});
                    }

                    @Override // com.prism.gaia.naked.core.ClassAccessor
                    public Class ORG_CLASS() {
                        return this.__ORG_CLASS.get();
                    }

                    @Override // com.prism.gaia.naked.metadata.android.location.LocationManagerCAGI.D.SumsungS5.C.GpsStatusListenerTransport
                    public NakedMethod<Void> onSvStatusChanged() {
                        return this.__onSvStatusChanged.get();
                    }
                }
            }
        }

        public static final class Impl_VIVO implements LocationManagerCAGI.D.VIVO {

            /* JADX INFO: renamed from: C, reason: collision with root package name */
            public Impl_C f165824C = new Impl_C();

            public static final class Impl_C implements LocationManagerCAGI.D.VIVO.C {
                public Impl_GpsStatusListenerTransport GpsStatusListenerTransport = new Impl_GpsStatusListenerTransport();

                @m
                public static final class Impl_GpsStatusListenerTransport implements LocationManagerCAGI.D.VIVO.C.GpsStatusListenerTransport {
                    private InitOnceClassTry __ORG_CLASS = new InitOnceClassTry("android.location.LocationManager$GpsStatusListenerTransport");
                    private InitOnceTry<NakedMethod<Void>> __onSvStatusChanged = new InitOnceTry<>(new InitOnce.Init() { // from class: V8.f
                        @Override // com.prism.gaia.naked.core.InitOnce.Init
                        public final Object onInit() {
                            return this.f76375a.lambda$new$0();
                        }
                    });

                    /* JADX INFO: Access modifiers changed from: private */
                    public /* synthetic */ NakedMethod lambda$new$0() throws Exception {
                        Class clsORG_CLASS = ORG_CLASS();
                        Class cls = Integer.TYPE;
                        return new NakedMethod((Class<?>) clsORG_CLASS, "onSvStatusChanged", (Class<?>[]) new Class[]{cls, int[].class, float[].class, float[].class, float[].class, cls, cls, cls, long[].class});
                    }

                    @Override // com.prism.gaia.naked.core.ClassAccessor
                    public Class ORG_CLASS() {
                        return this.__ORG_CLASS.get();
                    }

                    @Override // com.prism.gaia.naked.metadata.android.location.LocationManagerCAGI.D.VIVO.C.GpsStatusListenerTransport
                    public NakedMethod<Void> onSvStatusChanged() {
                        return this.__onSvStatusChanged.get();
                    }
                }
            }
        }
    }

    @l
    public static final class Impl_G implements LocationManagerCAGI.G {
        private InitOnceClass __ORG_CLASS = new InitOnceClass("android.location.LocationManager");
        private InitOnce<NakedObject<HashMap>> __mGnssNmeaListeners = new InitOnce<>(new InitOnce.Init() { // from class: V8.g
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f76376a.lambda$new$0();
            }
        });
        private InitOnce<NakedObject<HashMap>> __mGnssStatusListeners = new InitOnce<>(new InitOnce.Init() { // from class: V8.h
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f76377a.lambda$new$1();
            }
        });
        private InitOnce<NakedObject<HashMap>> __mGpsNmeaListeners = new InitOnce<>(new InitOnce.Init() { // from class: V8.i
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f76378a.lambda$new$2();
            }
        });
        private InitOnce<NakedObject<HashMap>> __mGpsStatusListeners = new InitOnce<>(new InitOnce.Init() { // from class: V8.j
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f76379a.lambda$new$3();
            }
        });
        private InitOnce<NakedObject<HashMap>> __mListeners = new InitOnce<>(new InitOnce.Init() { // from class: V8.k
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f76380a.lambda$new$4();
            }
        });
        private InitOnce<NakedObject<HashMap>> __mNmeaListeners = new InitOnce<>(new InitOnce.Init() { // from class: V8.l
            @Override // com.prism.gaia.naked.core.InitOnce.Init
            public final Object onInit() {
                return this.f76381a.lambda$new$5();
            }
        });
        public Impl_GnssStatusListenerTransport GnssStatusListenerTransport = new Impl_GnssStatusListenerTransport();
        public Impl_GpsStatusListenerTransport GpsStatusListenerTransport = new Impl_GpsStatusListenerTransport();
        public Impl_ListenerTransport ListenerTransport = new Impl_ListenerTransport();

        @l
        public static final class Impl_GnssStatusListenerTransport implements LocationManagerCAGI.G.GnssStatusListenerTransport {
            private InitOnceClass __ORG_CLASS = new InitOnceClass("android.location.LocationManager$GnssStatusListenerTransport");
            private InitOnce<NakedObject<Object>> __mGpsListener = new InitOnce<>(new InitOnce.Init() { // from class: V8.m
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f76382a.lambda$new$0();
                }
            });
            private InitOnce<NakedObject<Object>> __mGpsNmeaListener = new InitOnce<>(new InitOnce.Init() { // from class: V8.n
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f76383a.lambda$new$1();
                }
            });
            private InitOnce<NakedMethod<Void>> __onFirstFix = new InitOnce<>(new InitOnce.Init() { // from class: V8.o
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f76384a.lambda$new$2();
                }
            });
            private InitOnce<NakedMethod<Void>> __onGnssStarted = new InitOnce<>(new InitOnce.Init() { // from class: V8.p
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f76385a.lambda$new$3();
                }
            });
            private InitOnce<NakedMethod<Void>> __onNmeaReceived = new InitOnce<>(new InitOnce.Init() { // from class: V8.q
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f76386a.lambda$new$4();
                }
            });
            private InitOnce<NakedMethod<Void>> __onSvStatusChanged = new InitOnce<>(new InitOnce.Init() { // from class: V8.r
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f76387a.lambda$new$5();
                }
            });
            private InitOnce<NakedObject<Object>> __this$0 = new InitOnce<>(new InitOnce.Init() { // from class: V8.s
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f76388a.lambda$new$6();
                }
            });

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedObject lambda$new$0() throws Exception {
                return new NakedObject((Class<?>) ORG_CLASS(), "mGpsListener");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedObject lambda$new$1() throws Exception {
                return new NakedObject((Class<?>) ORG_CLASS(), "mGpsNmeaListener");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedMethod lambda$new$2() throws Exception {
                return new NakedMethod((Class<?>) ORG_CLASS(), "onFirstFix", (Class<?>[]) new Class[]{Integer.TYPE});
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedMethod lambda$new$3() throws Exception {
                return new NakedMethod((Class<?>) ORG_CLASS(), "onGnssStarted");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedMethod lambda$new$4() throws Exception {
                return new NakedMethod((Class<?>) ORG_CLASS(), "onNmeaReceived", (Class<?>[]) new Class[]{Long.TYPE, String.class});
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedMethod lambda$new$5() throws Exception {
                return new NakedMethod((Class<?>) ORG_CLASS(), "onSvStatusChanged", (Class<?>[]) new Class[]{Integer.TYPE, int[].class, float[].class, float[].class, float[].class, float[].class});
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedObject lambda$new$6() throws Exception {
                return new NakedObject((Class<?>) ORG_CLASS(), "this$0");
            }

            @Override // com.prism.gaia.naked.core.ClassAccessor
            public Class ORG_CLASS() {
                return this.__ORG_CLASS.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.location.LocationManagerCAGI.G.GnssStatusListenerTransport
            public NakedObject<Object> mGpsListener() {
                return this.__mGpsListener.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.location.LocationManagerCAGI.G.GnssStatusListenerTransport
            public NakedObject<Object> mGpsNmeaListener() {
                return this.__mGpsNmeaListener.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.location.LocationManagerCAGI.G.GnssStatusListenerTransport
            public NakedMethod<Void> onFirstFix() {
                return this.__onFirstFix.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.location.LocationManagerCAGI.G.GnssStatusListenerTransport
            public NakedMethod<Void> onGnssStarted() {
                return this.__onGnssStarted.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.location.LocationManagerCAGI.G.GnssStatusListenerTransport
            public NakedMethod<Void> onNmeaReceived() {
                return this.__onNmeaReceived.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.location.LocationManagerCAGI.G.GnssStatusListenerTransport
            public NakedMethod<Void> onSvStatusChanged() {
                return this.__onSvStatusChanged.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.location.LocationManagerCAGI.G.GnssStatusListenerTransport
            public NakedObject<Object> this$0() {
                return this.__this$0.get();
            }
        }

        @l
        public static final class Impl_GpsStatusListenerTransport implements LocationManagerCAGI.G.GpsStatusListenerTransport {
            private InitOnceClass __ORG_CLASS = new InitOnceClass("android.location.LocationManager$GpsStatusListenerTransport");
            private InitOnce<NakedObject<Object>> __mListener = new InitOnce<>(new InitOnce.Init() { // from class: V8.t
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f76389a.lambda$new$0();
                }
            });
            private InitOnce<NakedObject<Object>> __mNmeaListener = new InitOnce<>(new InitOnce.Init() { // from class: V8.u
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f76390a.lambda$new$1();
                }
            });
            private InitOnce<NakedMethod<Void>> __onFirstFix = new InitOnce<>(new InitOnce.Init() { // from class: V8.v
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f76391a.lambda$new$2();
                }
            });
            private InitOnce<NakedMethod<Void>> __onGpsStarted = new InitOnce<>(new InitOnce.Init() { // from class: V8.w
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f76392a.lambda$new$3();
                }
            });
            private InitOnce<NakedMethod<Void>> __onNmeaReceived = new InitOnce<>(new InitOnce.Init() { // from class: V8.x
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f76393a.lambda$new$4();
                }
            });
            private InitOnce<NakedMethod<Void>> __onSvStatusChanged = new InitOnce<>(new InitOnce.Init() { // from class: V8.y
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f76394a.lambda$new$5();
                }
            });
            private InitOnce<NakedObject<Object>> __this$0 = new InitOnce<>(new InitOnce.Init() { // from class: V8.z
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f76395a.lambda$new$6();
                }
            });

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedObject lambda$new$0() throws Exception {
                return new NakedObject((Class<?>) ORG_CLASS(), "mListener");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedObject lambda$new$1() throws Exception {
                return new NakedObject((Class<?>) ORG_CLASS(), "mNmeaListener");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedMethod lambda$new$2() throws Exception {
                return new NakedMethod((Class<?>) ORG_CLASS(), "onFirstFix", (Class<?>[]) new Class[]{Integer.TYPE});
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedMethod lambda$new$3() throws Exception {
                return new NakedMethod((Class<?>) ORG_CLASS(), "onGpsStarted");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedMethod lambda$new$4() throws Exception {
                return new NakedMethod((Class<?>) ORG_CLASS(), "onNmeaReceived", (Class<?>[]) new Class[]{Long.TYPE, String.class});
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedMethod lambda$new$5() throws Exception {
                Class clsORG_CLASS = ORG_CLASS();
                Class cls = Integer.TYPE;
                return new NakedMethod((Class<?>) clsORG_CLASS, "onSvStatusChanged", (Class<?>[]) new Class[]{cls, int[].class, float[].class, float[].class, float[].class, cls, cls, cls});
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedObject lambda$new$6() throws Exception {
                return new NakedObject((Class<?>) ORG_CLASS(), "this$0");
            }

            @Override // com.prism.gaia.naked.core.ClassAccessor
            public Class ORG_CLASS() {
                return this.__ORG_CLASS.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.location.LocationManagerCAGI.G.GpsStatusListenerTransport
            public NakedObject<Object> mListener() {
                return this.__mListener.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.location.LocationManagerCAGI.G.GpsStatusListenerTransport
            public NakedObject<Object> mNmeaListener() {
                return this.__mNmeaListener.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.location.LocationManagerCAGI.G.GpsStatusListenerTransport
            public NakedMethod<Void> onFirstFix() {
                return this.__onFirstFix.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.location.LocationManagerCAGI.G.GpsStatusListenerTransport
            public NakedMethod<Void> onGpsStarted() {
                return this.__onGpsStarted.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.location.LocationManagerCAGI.G.GpsStatusListenerTransport
            public NakedMethod<Void> onNmeaReceived() {
                return this.__onNmeaReceived.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.location.LocationManagerCAGI.G.GpsStatusListenerTransport
            public NakedMethod<Void> onSvStatusChanged() {
                return this.__onSvStatusChanged.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.location.LocationManagerCAGI.G.GpsStatusListenerTransport
            public NakedObject<Object> this$0() {
                return this.__this$0.get();
            }
        }

        @l
        public static final class Impl_ListenerTransport implements LocationManagerCAGI.G.ListenerTransport {
            private InitOnceClass __ORG_CLASS = new InitOnceClass("android.location.LocationManager$ListenerTransport");
            private InitOnce<NakedObject<LocationListener>> __mListener = new InitOnce<>(new InitOnce.Init() { // from class: V8.A
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f76360a.lambda$new$0();
                }
            });
            private InitOnce<NakedMethod<Void>> __onLocationChanged = new InitOnce<>(new InitOnce.Init() { // from class: V8.B
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f76361a.lambda$new$1();
                }
            });
            private InitOnce<NakedMethod<Void>> __onProviderDisabled = new InitOnce<>(new InitOnce.Init() { // from class: V8.C
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f76362a.lambda$new$2();
                }
            });
            private InitOnce<NakedMethod<Void>> __onProviderEnabled = new InitOnce<>(new InitOnce.Init() { // from class: V8.D
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f76363a.lambda$new$3();
                }
            });
            private InitOnce<NakedMethod<Void>> __onStatusChanged = new InitOnce<>(new InitOnce.Init() { // from class: V8.E
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f76364a.lambda$new$4();
                }
            });
            private InitOnce<NakedObject<Object>> __this$0 = new InitOnce<>(new InitOnce.Init() { // from class: V8.F
                @Override // com.prism.gaia.naked.core.InitOnce.Init
                public final Object onInit() {
                    return this.f76365a.lambda$new$5();
                }
            });

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedObject lambda$new$0() throws Exception {
                return new NakedObject((Class<?>) ORG_CLASS(), "mListener");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedMethod lambda$new$1() throws Exception {
                return new NakedMethod((Class<?>) ORG_CLASS(), "onLocationChanged", (Class<?>[]) new Class[]{Location.class});
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedMethod lambda$new$2() throws Exception {
                return new NakedMethod((Class<?>) ORG_CLASS(), "onProviderDisabled", (Class<?>[]) new Class[]{String.class});
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedMethod lambda$new$3() throws Exception {
                return new NakedMethod((Class<?>) ORG_CLASS(), "onProviderEnabled", (Class<?>[]) new Class[]{String.class});
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedMethod lambda$new$4() throws Exception {
                return new NakedMethod((Class<?>) ORG_CLASS(), "onStatusChanged", (Class<?>[]) new Class[]{String.class, Integer.TYPE, Bundle.class});
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ NakedObject lambda$new$5() throws Exception {
                return new NakedObject((Class<?>) ORG_CLASS(), "this$0");
            }

            @Override // com.prism.gaia.naked.core.ClassAccessor
            public Class ORG_CLASS() {
                return this.__ORG_CLASS.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.location.LocationManagerCAGI.G.ListenerTransport
            public NakedObject<LocationListener> mListener() {
                return this.__mListener.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.location.LocationManagerCAGI.G.ListenerTransport
            public NakedMethod<Void> onLocationChanged() {
                return this.__onLocationChanged.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.location.LocationManagerCAGI.G.ListenerTransport
            public NakedMethod<Void> onProviderDisabled() {
                return this.__onProviderDisabled.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.location.LocationManagerCAGI.G.ListenerTransport
            public NakedMethod<Void> onProviderEnabled() {
                return this.__onProviderEnabled.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.location.LocationManagerCAGI.G.ListenerTransport
            public NakedMethod<Void> onStatusChanged() {
                return this.__onStatusChanged.get();
            }

            @Override // com.prism.gaia.naked.metadata.android.location.LocationManagerCAGI.G.ListenerTransport
            public NakedObject<Object> this$0() {
                return this.__this$0.get();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedObject lambda$new$0() throws Exception {
            return new NakedObject((Class<?>) ORG_CLASS(), "mGnssNmeaListeners");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedObject lambda$new$1() throws Exception {
            return new NakedObject((Class<?>) ORG_CLASS(), "mGnssStatusListeners");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedObject lambda$new$2() throws Exception {
            return new NakedObject((Class<?>) ORG_CLASS(), "mGpsNmeaListeners");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedObject lambda$new$3() throws Exception {
            return new NakedObject((Class<?>) ORG_CLASS(), "mGpsStatusListeners");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedObject lambda$new$4() throws Exception {
            return new NakedObject((Class<?>) ORG_CLASS(), "mListeners");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ NakedObject lambda$new$5() throws Exception {
            return new NakedObject((Class<?>) ORG_CLASS(), "mNmeaListeners");
        }

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.location.LocationManagerCAGI.G
        public NakedObject<HashMap> mGnssNmeaListeners() {
            return this.__mGnssNmeaListeners.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.location.LocationManagerCAGI.G
        public NakedObject<HashMap> mGnssStatusListeners() {
            return this.__mGnssStatusListeners.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.location.LocationManagerCAGI.G
        public NakedObject<HashMap> mGpsNmeaListeners() {
            return this.__mGpsNmeaListeners.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.location.LocationManagerCAGI.G
        public NakedObject<HashMap> mGpsStatusListeners() {
            return this.__mGpsStatusListeners.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.location.LocationManagerCAGI.G
        public NakedObject<HashMap> mListeners() {
            return this.__mListeners.get();
        }

        @Override // com.prism.gaia.naked.metadata.android.location.LocationManagerCAGI.G
        public NakedObject<HashMap> mNmeaListeners() {
            return this.__mNmeaListeners.get();
        }
    }
}
