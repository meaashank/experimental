package p3;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.engine.s;
import g3.C4447e;
import g3.InterfaceC4448f;
import java.io.File;
import java.io.IOException;

/* JADX INFO: renamed from: p3.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C5386a implements InterfaceC4448f<File, File> {
    @Override // g3.InterfaceC4448f
    public /* bridge */ /* synthetic */ boolean b(@NonNull File file, @NonNull C4447e c4447e) throws IOException {
        return true;
    }

    @Override // g3.InterfaceC4448f
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public s<File> a(@NonNull File file, int i10, int i11, @NonNull C4447e c4447e) {
        return new C5387b(file);
    }

    public boolean d(@NonNull File file, @NonNull C4447e c4447e) {
        return true;
    }
}
