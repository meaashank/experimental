package C2;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.versionedparcelable.ParcelImpl;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f17532a = "a";

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static <T extends f> T a(InputStream inputStream) {
        return (T) new androidx.versionedparcelable.a(inputStream, null).g0();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static <T extends f> T b(Parcelable parcelable) {
        if (parcelable instanceof ParcelImpl) {
            return (T) ((ParcelImpl) parcelable).getVersionedParcel();
        }
        throw new IllegalArgumentException("Invalid parcel");
    }

    @Nullable
    public static <T extends f> T c(@NonNull Bundle bundle, @NonNull String str) {
        try {
            Bundle bundle2 = (Bundle) bundle.getParcelable(str);
            if (bundle2 == null) {
                return null;
            }
            bundle2.setClassLoader(c.class.getClassLoader());
            return (T) b(bundle2.getParcelable("a"));
        } catch (RuntimeException unused) {
            return null;
        }
    }

    @Nullable
    public static <T extends f> List<T> d(Bundle bundle, String str) {
        ArrayList arrayList = new ArrayList();
        try {
            Bundle bundle2 = (Bundle) bundle.getParcelable(str);
            bundle2.setClassLoader(c.class.getClassLoader());
            ArrayList parcelableArrayList = bundle2.getParcelableArrayList("a");
            int size = parcelableArrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = parcelableArrayList.get(i10);
                i10++;
                arrayList.add(b((Parcelable) obj));
            }
            return arrayList;
        } catch (RuntimeException unused) {
            return null;
        }
    }

    public static void e(@NonNull Bundle bundle, @NonNull String str, @Nullable f fVar) {
        if (fVar == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("a", new ParcelImpl(fVar));
        bundle.putParcelable(str, bundle2);
    }

    public static void f(@NonNull Bundle bundle, @NonNull String str, @NonNull List<? extends f> list) {
        Bundle bundle2 = new Bundle();
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        Iterator<? extends f> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new ParcelImpl(it.next()));
        }
        bundle2.putParcelableArrayList("a", arrayList);
        bundle.putParcelable(str, bundle2);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static void g(f fVar, OutputStream outputStream) {
        androidx.versionedparcelable.a aVar = new androidx.versionedparcelable.a(null, outputStream);
        aVar.l1(fVar);
        aVar.a();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static Parcelable h(f fVar) {
        return new ParcelImpl(fVar);
    }
}
