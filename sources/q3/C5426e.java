package q3;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.engine.o;

/* JADX INFO: renamed from: q3.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C5426e extends o3.j<C5424c> implements o {
    public C5426e(C5424c c5424c) {
        super(c5424c);
    }

    @Override // com.bumptech.glide.load.engine.s
    public void a() {
        ((C5424c) this.f223214a).stop();
        ((C5424c) this.f223214a).m();
    }

    @Override // com.bumptech.glide.load.engine.s
    @NonNull
    public Class<C5424c> b() {
        return C5424c.class;
    }

    @Override // com.bumptech.glide.load.engine.s
    public int getSize() {
        return ((C5424c) this.f223214a).j();
    }

    @Override // o3.j, com.bumptech.glide.load.engine.o
    public void initialize() {
        ((C5424c) this.f223214a).e().prepareToDraw();
    }
}
