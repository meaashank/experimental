package s0;

import s0.x;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class D {
    public static int a(String str) {
        str.getClass();
        switch (str) {
            case "transitionFlags":
                return x.h.f238414q;
            case "duration":
                return x.h.f238407j;
            case "motionInterpolator":
                return x.h.f238412o;
            case "autoTransition":
                return x.h.f238411n;
            case "to":
                return x.h.f238409l;
            case "from":
                return x.h.f238408k;
            case "pathMotionArc":
                return 509;
            case "staggered":
                return x.h.f238413p;
            default:
                return -1;
        }
    }

    public static int b(int i10) {
        if (i10 == 509) {
            return 2;
        }
        switch (i10) {
            case x.h.f238407j /* 700 */:
                return 2;
            case x.h.f238408k /* 701 */:
            case x.h.f238409l /* 702 */:
                return 8;
            default:
                switch (i10) {
                    case x.h.f238412o /* 705 */:
                    case x.h.f238414q /* 707 */:
                        return 8;
                    case x.h.f238413p /* 706 */:
                        return 4;
                    default:
                        return -1;
                }
        }
    }
}
