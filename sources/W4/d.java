package W4;

import android.content.Context;
import android.os.Parcel;
import android.util.Log;
import com.gaia.ngallery.sync.model.SyncAccount;
import com.prism.commons.utils.C3858w;
import com.prism.commons.utils.l0;
import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f76613a = l0.b(d.class.getSimpleName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static d f76614b = new d();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f76615c = "SYNC_ACCOUNT_FILE";

    public static d b() {
        return f76614b;
    }

    public final File a(Context context) {
        return new File(context.getApplicationInfo().dataDir, f76615c);
    }

    public SyncAccount c(Context context) {
        File fileA = a(context);
        if (!fileA.exists()) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            C3858w.Q(parcelObtain, fileA);
            return (SyncAccount) SyncAccount.CREATOR.createFromParcel(parcelObtain);
        } catch (Exception e10) {
            Log.e(f76613a, "loadGalleryAsync sync state failed ", e10);
            return null;
        } finally {
            parcelObtain.recycle();
        }
    }

    public void d(Context context) {
        a(context).delete();
    }

    public void e(Context context, SyncAccount syncAccount) {
        File fileA = a(context);
        Parcel parcelObtain = Parcel.obtain();
        try {
            syncAccount.writeToParcel(parcelObtain, 0);
            C3858w.L(fileA);
            C3858w.R(parcelObtain, fileA);
        } catch (Exception e10) {
            Log.e(f76613a, "loadGalleryAsync sync state failed ", e10);
        } finally {
            parcelObtain.recycle();
        }
    }
}
