package Ua;

import androidx.annotation.NonNull;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.d;
import com.prism.lib.pfs.d;
import com.prism.lib.pfs.file.image.PrivateImage;
import java.io.InputStream;

/* JADX INFO: loaded from: classes7.dex */
@Deprecated
public class a implements d<InputStream> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f74188b = "a";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public PrivateImage f74189a;

    public a(PrivateImage privateImage) {
        this.f74189a = privateImage;
    }

    @Override // com.bumptech.glide.load.data.d
    @NonNull
    public Class<InputStream> a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.d
    @NonNull
    public DataSource c() {
        return DataSource.LOCAL;
    }

    @Override // com.bumptech.glide.load.data.d
    public void d(@NonNull Priority priority, @NonNull d.a<? super InputStream> aVar) {
        try {
            aVar.e(this.f74189a.getDecryptedInputStream());
        } catch (Exception unused) {
            aVar.e(this.f74189a.getAppContext().getResources().openRawResource(d.g.f186151R1));
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public void b() {
    }

    @Override // com.bumptech.glide.load.data.d
    public void cancel() {
    }
}
