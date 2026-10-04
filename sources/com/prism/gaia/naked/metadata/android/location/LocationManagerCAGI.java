package com.prism.gaia.naked.metadata.android.location;

import W6.b;
import W6.c;
import W6.f;
import W6.j;
import W6.l;
import W6.m;
import W6.n;
import W6.p;
import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import com.prism.gaia.naked.core.ClassAccessor;
import com.prism.gaia.naked.entity.NakedMethod;
import com.prism.gaia.naked.entity.NakedObject;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
@b
@c
public final class LocationManagerCAGI {

    public interface D {

        public interface OPPO_R815T {

            public interface C {

                @m
                @j("android.location.LocationManager$GpsStatusListenerTransport")
                public interface GpsStatusListenerTransport extends ClassAccessor {
                    @p("onSvStatusChanged")
                    @f({int.class, int[].class, float[].class, float[].class, float[].class, int[].class, int[].class, int[].class, int.class})
                    NakedMethod<Void> onSvStatusChanged();
                }
            }
        }

        public interface SumsungS5 {

            public interface C {

                @m
                @j("android.location.LocationManager$GpsStatusListenerTransport")
                public interface GpsStatusListenerTransport extends ClassAccessor {
                    @p("onSvStatusChanged")
                    @f({int.class, int[].class, float[].class, float[].class, float[].class, int.class, int.class, int.class, int[].class})
                    NakedMethod<Void> onSvStatusChanged();
                }
            }
        }

        public interface VIVO {

            public interface C {

                @m
                @j("android.location.LocationManager$GpsStatusListenerTransport")
                public interface GpsStatusListenerTransport extends ClassAccessor {
                    @p("onSvStatusChanged")
                    @f({int.class, int[].class, float[].class, float[].class, float[].class, int.class, int.class, int.class, long[].class})
                    NakedMethod<Void> onSvStatusChanged();
                }
            }
        }
    }

    @l
    @j("android.location.LocationManager")
    public interface G extends ClassAccessor {

        @l
        @j("android.location.LocationManager$GnssStatusListenerTransport")
        public interface GnssStatusListenerTransport extends ClassAccessor {
            @n("mGpsListener")
            NakedObject<Object> mGpsListener();

            @n("mGpsNmeaListener")
            NakedObject<Object> mGpsNmeaListener();

            @p("onFirstFix")
            @f({int.class})
            NakedMethod<Void> onFirstFix();

            @p("onGnssStarted")
            NakedMethod<Void> onGnssStarted();

            @p("onNmeaReceived")
            @f({long.class, String.class})
            NakedMethod<Void> onNmeaReceived();

            @p("onSvStatusChanged")
            @f({int.class, int[].class, float[].class, float[].class, float[].class, float[].class})
            NakedMethod<Void> onSvStatusChanged();

            @n("this$0")
            NakedObject<Object> this$0();
        }

        @l
        @j("android.location.LocationManager$GpsStatusListenerTransport")
        public interface GpsStatusListenerTransport extends ClassAccessor {
            @n("mListener")
            NakedObject<Object> mListener();

            @n("mNmeaListener")
            NakedObject<Object> mNmeaListener();

            @p("onFirstFix")
            @f({int.class})
            NakedMethod<Void> onFirstFix();

            @p("onGpsStarted")
            NakedMethod<Void> onGpsStarted();

            @p("onNmeaReceived")
            @f({long.class, String.class})
            NakedMethod<Void> onNmeaReceived();

            @p("onSvStatusChanged")
            @f({int.class, int[].class, float[].class, float[].class, float[].class, int.class, int.class, int.class})
            NakedMethod<Void> onSvStatusChanged();

            @n("this$0")
            NakedObject<Object> this$0();
        }

        @l
        @j("android.location.LocationManager$ListenerTransport")
        public interface ListenerTransport extends ClassAccessor {
            @n("mListener")
            NakedObject<LocationListener> mListener();

            @p("onLocationChanged")
            @f({Location.class})
            NakedMethod<Void> onLocationChanged();

            @p("onProviderDisabled")
            @f({String.class})
            NakedMethod<Void> onProviderDisabled();

            @p("onProviderEnabled")
            @f({String.class})
            NakedMethod<Void> onProviderEnabled();

            @p("onStatusChanged")
            @f({String.class, int.class, Bundle.class})
            NakedMethod<Void> onStatusChanged();

            @n("this$0")
            NakedObject<Object> this$0();
        }

        @n("mGnssNmeaListeners")
        NakedObject<HashMap> mGnssNmeaListeners();

        @n("mGnssStatusListeners")
        NakedObject<HashMap> mGnssStatusListeners();

        @n("mGpsNmeaListeners")
        NakedObject<HashMap> mGpsNmeaListeners();

        @n("mGpsStatusListeners")
        NakedObject<HashMap> mGpsStatusListeners();

        @n("mListeners")
        NakedObject<HashMap> mListeners();

        @n("mNmeaListeners")
        NakedObject<HashMap> mNmeaListeners();
    }
}
