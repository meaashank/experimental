package Va;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.d;
import com.prism.commons.utils.C3855t;
import com.prism.commons.utils.l0;
import com.prism.lib.pfs.d;
import com.prism.lib.pfs.file.video.PrivateVideo;

/* JADX INFO: loaded from: classes7.dex */
public class a implements d<Bitmap> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f76410b = l0.b(a.class.getSimpleName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public PrivateVideo f76411a;

    public a(PrivateVideo privateVideo) {
        this.f76411a = privateVideo;
    }

    @Override // com.bumptech.glide.load.data.d
    @NonNull
    public Class<Bitmap> a() {
        return Bitmap.class;
    }

    @Override // com.bumptech.glide.load.data.d
    @NonNull
    public DataSource c() {
        return DataSource.LOCAL;
    }

    @Override // com.bumptech.glide.load.data.d
    public void d(@NonNull Priority priority, @NonNull d.a<? super Bitmap> aVar) throws Throwable {
        Bitmap thumbnail = this.f76411a.getThumbnail();
        if (thumbnail == null) {
            thumbnail = C3855t.b(this.f76411a.getAppContext().getResources(), d.g.f186193b2);
        }
        aVar.e(thumbnail);
    }

    @Override // com.bumptech.glide.load.data.d
    public void b() {
    }

    @Override // com.bumptech.glide.load.data.d
    public void cancel() {
    }
}
