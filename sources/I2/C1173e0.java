package I2;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.TypedValue;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;

/* JADX INFO: renamed from: I2.e0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C1173e0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f51013b = "text/plain";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final Context f51014a;

    public C1173e0(@NonNull Context context) {
        this.f51014a = context;
    }

    @NonNull
    public static String a(@NonNull File file) throws IOException {
        String canonicalPath = file.getCanonicalPath();
        return !canonicalPath.endsWith(RemoteSettings.FORWARD_SLASH_STRING) ? canonicalPath.concat(RemoteSettings.FORWARD_SLASH_STRING) : canonicalPath;
    }

    @Nullable
    public static File b(@NonNull File file, @NonNull String str) throws IOException {
        String strA = a(file);
        String canonicalPath = new File(file, str).getCanonicalPath();
        if (canonicalPath.startsWith(strA)) {
            return new File(canonicalPath);
        }
        return null;
    }

    @NonNull
    public static File c(@NonNull Context context) {
        return Build.VERSION.SDK_INT >= 24 ? context.getDataDir() : context.getCacheDir().getParentFile();
    }

    @NonNull
    public static String f(@NonNull String str) {
        String strA = C1187l0.a(str);
        return strA == null ? "text/plain" : strA;
    }

    @NonNull
    public static InputStream g(@NonNull String str, @NonNull InputStream inputStream) throws IOException {
        return str.endsWith(".svgz") ? new GZIPInputStream(inputStream) : inputStream;
    }

    @NonNull
    public static InputStream i(@NonNull File file) throws IOException {
        return g(file.getPath(), new FileInputStream(file));
    }

    @NonNull
    public static String k(@NonNull String str) {
        return (str.length() <= 1 || str.charAt(0) != '/') ? str : str.substring(1);
    }

    public final int d(@NonNull String str, @NonNull String str2) {
        return this.f51014a.getResources().getIdentifier(str2, str, this.f51014a.getPackageName());
    }

    public final int e(int i10) {
        TypedValue typedValue = new TypedValue();
        this.f51014a.getResources().getValue(i10, typedValue, true);
        return typedValue.type;
    }

    @NonNull
    public InputStream h(@NonNull String str) throws IOException {
        String strK = k(str);
        return g(strK, this.f51014a.getAssets().open(strK, 2));
    }

    @NonNull
    public InputStream j(@NonNull String str) throws Resources.NotFoundException, IOException {
        String strK = k(str);
        String[] strArrSplit = strK.split(RemoteSettings.FORWARD_SLASH_STRING, -1);
        if (strArrSplit.length != 2) {
            throw new IllegalArgumentException("Incorrect resource path: ".concat(strK));
        }
        String str2 = strArrSplit[0];
        String strSubstring = strArrSplit[1];
        int iLastIndexOf = strSubstring.lastIndexOf(46);
        if (iLastIndexOf != -1) {
            strSubstring = strSubstring.substring(0, iLastIndexOf);
        }
        int iD = d(str2, strSubstring);
        int iE = e(iD);
        if (iE == 3) {
            return g(strK, this.f51014a.getResources().openRawResource(iD));
        }
        throw new IOException(String.format("Expected %s resource to be of TYPE_STRING but was %d", strK, Integer.valueOf(iE)));
    }
}
