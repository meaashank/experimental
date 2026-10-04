package W4;

import android.content.Context;
import android.os.Parcel;
import android.util.Log;
import com.gaia.ngallery.sync.model.FileLastSyncedInfo;
import com.prism.commons.utils.C3858w;
import com.prism.commons.utils.l0;
import com.prism.lib.pfs.file.PrivateFile;
import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f76595b = l0.b(a.class.getSimpleName());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static a f76596c = new a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f76597d = "SYNC_STATE_ROOT";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f76598e = ".sync_state";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public File f76599a = null;

    public static a c() {
        return f76596c;
    }

    public final File a(Context context, PrivateFile privateFile, boolean z10) {
        String relativePath = privateFile.getRelativePath();
        if (z10) {
            relativePath = android.support.v4.media.e.a(androidx.compose.runtime.changelist.a.a(relativePath), File.separator, f76598e);
        }
        File fileB = b(context);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(fileB.getAbsolutePath());
        return new File(android.support.v4.media.e.a(sb2, File.separator, relativePath));
    }

    public final File b(Context context) {
        if (this.f76599a == null) {
            this.f76599a = new File(context.getApplicationInfo().dataDir, f76597d);
        }
        return this.f76599a;
    }

    public boolean d(Context context, PrivateFile privateFile) {
        return a(context, privateFile, false).exists();
    }

    public FileLastSyncedInfo e(Context context, PrivateFile privateFile) {
        return g(context, privateFile, true);
    }

    public FileLastSyncedInfo f(Context context, PrivateFile privateFile) {
        return g(context, privateFile, false);
    }

    public final FileLastSyncedInfo g(Context context, PrivateFile privateFile, boolean z10) {
        File fileA = a(context, privateFile, z10);
        if (!fileA.exists()) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            C3858w.Q(parcelObtain, fileA);
            return (FileLastSyncedInfo) FileLastSyncedInfo.CREATOR.createFromParcel(parcelObtain);
        } catch (Exception e10) {
            Log.e(f76595b, "loadGalleryAsync sync state failed ", e10);
            return null;
        } finally {
            parcelObtain.recycle();
        }
    }

    public void h(Context context) {
        C3858w.T(b(context).getAbsolutePath());
    }

    public void i(Context context, PrivateFile privateFile) {
        File fileA = a(context, privateFile, true);
        if (fileA.exists()) {
            fileA.delete();
        }
    }

    public void j(Context context, PrivateFile privateFile) {
        File fileA = a(context, privateFile, false);
        if (fileA.exists()) {
            fileA.delete();
        }
    }

    public void k(Context context, PrivateFile privateFile, FileLastSyncedInfo fileLastSyncedInfo) {
        m(context, privateFile, fileLastSyncedInfo, true);
    }

    public void l(Context context, PrivateFile privateFile, FileLastSyncedInfo fileLastSyncedInfo) {
        m(context, privateFile, fileLastSyncedInfo, false);
    }

    public final void m(Context context, PrivateFile privateFile, FileLastSyncedInfo fileLastSyncedInfo, boolean z10) {
        File fileA = a(context, privateFile, z10);
        Parcel parcelObtain = Parcel.obtain();
        try {
            fileLastSyncedInfo.writeToParcel(parcelObtain, 0);
            C3858w.L(fileA);
            C3858w.R(parcelObtain, fileA);
        } catch (Exception e10) {
            Log.e(f76595b, "loadGalleryAsync sync state failed ", e10);
        } finally {
            parcelObtain.recycle();
        }
    }
}
