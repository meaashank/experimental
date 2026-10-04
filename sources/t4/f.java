package T4;

import com.gaia.ngallery.model.MediaFile;
import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ((MediaFile) obj2).getName().compareTo(((MediaFile) obj).getName());
    }
}
