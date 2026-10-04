package T4;

import com.gaia.ngallery.model.MediaFile;
import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ((MediaFile) obj).getName().compareTo(((MediaFile) obj2).getName());
    }
}
