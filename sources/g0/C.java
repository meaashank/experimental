package G0;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder$OnHeaderDecodedListener;
import android.graphics.drawable.Drawable;
import kotlin.L0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"ClassVerificationFailure"})
public final class C {

    public static final class a implements ImageDecoder$OnHeaderDecodedListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ed.q<ImageDecoder, ImageDecoder.ImageInfo, ImageDecoder.Source, L0> f40028a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(ed.q<? super ImageDecoder, ? super ImageDecoder.ImageInfo, ? super ImageDecoder.Source, L0> qVar) {
            this.f40028a = qVar;
        }

        public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
            this.f40028a.invoke(imageDecoder, imageInfo, source);
        }
    }

    public static final class b implements ImageDecoder$OnHeaderDecodedListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ed.q<ImageDecoder, ImageDecoder.ImageInfo, ImageDecoder.Source, L0> f40029a;

        /* JADX WARN: Multi-variable type inference failed */
        public b(ed.q<? super ImageDecoder, ? super ImageDecoder.ImageInfo, ? super ImageDecoder.Source, L0> qVar) {
            this.f40029a = qVar;
        }

        public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
            this.f40029a.invoke(imageDecoder, imageInfo, source);
        }
    }

    @e.T(28)
    @NotNull
    public static final Bitmap a(@NotNull ImageDecoder.Source source, @NotNull ed.q<? super ImageDecoder, ? super ImageDecoder.ImageInfo, ? super ImageDecoder.Source, L0> qVar) {
        return ImageDecoder.decodeBitmap(source, C1163z.a(new a(qVar)));
    }

    @e.T(28)
    @NotNull
    public static final Drawable b(@NotNull ImageDecoder.Source source, @NotNull ed.q<? super ImageDecoder, ? super ImageDecoder.ImageInfo, ? super ImageDecoder.Source, L0> qVar) {
        return ImageDecoder.decodeDrawable(source, C1163z.a(new b(qVar)));
    }
}
