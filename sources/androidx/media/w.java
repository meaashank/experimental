package androidx.media;

import android.media.VolumeProvider;
import e.T;

/* JADX INFO: loaded from: classes2.dex */
@T(21)
public class w {

    public static class a extends VolumeProvider {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b f114840a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i10, int i11, int i12, b bVar) {
            super(i10, i11, i12);
            this.f114840a = bVar;
        }

        @Override // android.media.VolumeProvider
        public void onAdjustVolume(int i10) {
            this.f114840a.b(i10);
        }

        @Override // android.media.VolumeProvider
        public void onSetVolumeTo(int i10) {
            this.f114840a.a(i10);
        }
    }

    public interface b {
        void a(int i10);

        void b(int i10);
    }

    public static Object a(int i10, int i11, int i12, b bVar) {
        return new a(i10, i11, i12, bVar);
    }

    public static void b(Object obj, int i10) {
        ((VolumeProvider) obj).setCurrentVolume(i10);
    }
}
