package i7;

import android.os.Handler;
import android.os.Message;
import com.prism.gaia.client.GaiaContext;
import com.prism.gaia.naked.compat.android.app.ActivityThreadCompat2;
import v8.C5705o;

/* JADX INFO: loaded from: classes6.dex */
public class r implements Handler.Callback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f202902b = "asdf-".concat(r.class.getSimpleName());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f202903c = ActivityThreadCompat2.Util.SCHEDULE_CRASH;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Handler.Callback f202904a;

    public r(Handler.Callback callback) {
        this.f202904a = callback;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        ActivityThreadCompat2.Util.getMsgCodeName(message.what);
        if (f202903c == message.what) {
            try {
                GaiaContext gaiaContextJ = GaiaContext.j();
                C5705o.c().e(new RuntimeException("SCHEDULE_CRASH_SUPERVISOR: " + message.obj), gaiaContextJ.v(), gaiaContextJ.s(), "SCHEDULE_CRASH_SUPERVISOR", null);
                return false;
            } catch (Throwable unused) {
            }
        } else {
            Handler.Callback callback = this.f202904a;
            if (callback != null) {
                return callback.handleMessage(message);
            }
        }
        return false;
    }
}
