package G0;

import D0.f;
import Q0.l;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import s0.x;

/* JADX INFO: loaded from: classes2.dex */
@e.T(29)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class a0 extends b0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f40090d = "TypefaceCompatApi29Impl";

    @Nullable
    public static FontFamily q(@Nullable CancellationSignal cancellationSignal, @NonNull l.c[] cVarArr, ContentResolver contentResolver) {
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor;
        FontFamily.Builder builder = null;
        for (l.c cVar : cVarArr) {
            try {
                parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(cVar.d(), CampaignEx.JSON_KEY_AD_R, cancellationSignal);
            } catch (IOException e10) {
                Log.w(f40090d, "Font load failed", e10);
            }
            if (parcelFileDescriptorOpenFileDescriptor == null) {
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                }
            } else {
                try {
                    Font fontBuild = new Font.Builder(parcelFileDescriptorOpenFileDescriptor).setWeight(cVar.e()).setSlant(cVar.f() ? 1 : 0).setTtcIndex(cVar.c()).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(fontBuild);
                    } else {
                        builder.addFont(fontBuild);
                    }
                } catch (Throwable th) {
                    try {
                        parcelFileDescriptorOpenFileDescriptor.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            parcelFileDescriptorOpenFileDescriptor.close();
        }
        if (builder == null) {
            return null;
        }
        return builder.build();
    }

    public static int r(@NonNull FontStyle fontStyle, @NonNull FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    @Override // G0.b0
    @Nullable
    public Typeface b(Context context, f.d dVar, Resources resources, int i10) {
        try {
            FontFamily.Builder builder = null;
            for (f.e eVar : dVar.f17631a) {
                try {
                    Font fontBuild = new Font.Builder(resources, eVar.f17637f).setWeight(eVar.f17633b).setSlant(eVar.f17634c ? 1 : 0).setTtcIndex(eVar.f17636e).setFontVariationSettings(eVar.f17635d).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(fontBuild);
                    } else {
                        builder.addFont(fontBuild);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily fontFamilyBuild = builder.build();
            return new Typeface.CustomFallbackBuilder(fontFamilyBuild).setStyle(p(fontFamilyBuild, i10).getStyle()).build();
        } catch (Exception e10) {
            Log.w(f40090d, "Font load failed", e10);
            return null;
        }
    }

    @Override // G0.b0
    @Nullable
    public Typeface d(Context context, @Nullable CancellationSignal cancellationSignal, @NonNull l.c[] cVarArr, int i10) {
        try {
            FontFamily fontFamilyQ = q(cancellationSignal, cVarArr, context.getContentResolver());
            if (fontFamilyQ == null) {
                return null;
            }
            return new Typeface.CustomFallbackBuilder(fontFamilyQ).setStyle(p(fontFamilyQ, i10).getStyle()).build();
        } catch (Exception e10) {
            Log.w(f40090d, "Font load failed", e10);
            return null;
        }
    }

    @Override // G0.b0
    @Nullable
    public Typeface e(@NonNull Context context, @Nullable CancellationSignal cancellationSignal, @NonNull List<l.c[]> list, int i10) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily fontFamilyQ = q(cancellationSignal, list.get(0), contentResolver);
            if (fontFamilyQ == null) {
                return null;
            }
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(fontFamilyQ);
            for (int i11 = 1; i11 < list.size(); i11++) {
                FontFamily fontFamilyQ2 = q(cancellationSignal, list.get(i11), contentResolver);
                if (fontFamilyQ2 != null) {
                    customFallbackBuilder.addCustomFallback(fontFamilyQ2);
                }
            }
            return customFallbackBuilder.setStyle(p(fontFamilyQ, i10).getStyle()).build();
        } catch (Exception e10) {
            Log.w(f40090d, "Font load failed", e10);
            return null;
        }
    }

    @Override // G0.b0
    public Typeface f(Context context, InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override // G0.b0
    @Nullable
    public Typeface g(Context context, Resources resources, int i10, String str, int i11) {
        try {
            Font fontBuild = new Font.Builder(resources, i10).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(fontBuild).build()).setStyle(fontBuild.getStyle()).build();
        } catch (Exception e10) {
            Log.w(f40090d, "Font load failed", e10);
            return null;
        }
    }

    @Override // G0.b0
    @NonNull
    public Typeface h(@NonNull Context context, @NonNull Typeface typeface, int i10, boolean z10) {
        return Typeface.create(typeface, i10, z10);
    }

    @Override // G0.b0
    public l.c m(l.c[] cVarArr, int i10) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    public final Font p(@NonNull FontFamily fontFamily, int i10) {
        FontStyle fontStyle = new FontStyle((i10 & 1) != 0 ? x.h.f238407j : 400, (i10 & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int iR = r(fontStyle, font.getStyle());
        for (int i11 = 1; i11 < fontFamily.getSize(); i11++) {
            Font font2 = fontFamily.getFont(i11);
            int iR2 = r(fontStyle, font2.getStyle());
            if (iR2 < iR) {
                font = font2;
                iR = iR2;
            }
        }
        return font;
    }
}
