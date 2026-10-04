package com.github.appintro.model;

import android.os.Bundle;
import androidx.activity.C1477d;
import com.github.appintro.AppIntroBaseFragmentKt;
import dd.k;
import e.InterfaceC4337k;
import e.InterfaceC4339m;
import e.InterfaceC4346u;
import e.InterfaceC4349x;
import kotlin.InterfaceC4852c0;
import kotlin.InterfaceC4982o;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class SliderPage {
    private int backgroundColor;
    private int backgroundColorRes;
    private int backgroundDrawable;

    @Nullable
    private CharSequence description;
    private int descriptionColor;
    private int descriptionColorRes;

    @Nullable
    private String descriptionTypeface;
    private int descriptionTypefaceFontRes;
    private int imageDrawable;

    @Nullable
    private CharSequence title;
    private int titleColor;
    private int titleColorRes;

    @Nullable
    private String titleTypeface;
    private int titleTypefaceFontRes;

    @k
    public SliderPage() {
        this(null, null, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, null, 0, 16383, null);
    }

    @InterfaceC4982o(message = "`backgroundColor` has been deprecated to support configuration changes", replaceWith = @InterfaceC4852c0(expression = "backgroundColorRes", imports = {}))
    public static /* synthetic */ void getBackgroundColor$annotations() {
    }

    @InterfaceC4982o(message = "`descriptionColor` has been deprecated to support configuration changes", replaceWith = @InterfaceC4852c0(expression = "descriptionColorRes", imports = {}))
    public static /* synthetic */ void getDescriptionColor$annotations() {
    }

    @InterfaceC4982o(message = "`titleColor` has been deprecated to support configuration changes", replaceWith = @InterfaceC4852c0(expression = "titleColorRes", imports = {}))
    public static /* synthetic */ void getTitleColor$annotations() {
    }

    @Nullable
    public final CharSequence component1() {
        return this.title;
    }

    public final int component10() {
        return this.titleTypefaceFontRes;
    }

    public final int component11() {
        return this.descriptionTypefaceFontRes;
    }

    @Nullable
    public final String component12() {
        return this.titleTypeface;
    }

    @Nullable
    public final String component13() {
        return this.descriptionTypeface;
    }

    public final int component14() {
        return this.backgroundDrawable;
    }

    @Nullable
    public final CharSequence component2() {
        return this.description;
    }

    public final int component3() {
        return this.imageDrawable;
    }

    public final int component4() {
        return this.backgroundColor;
    }

    public final int component5() {
        return this.titleColor;
    }

    public final int component6() {
        return this.descriptionColor;
    }

    public final int component7() {
        return this.backgroundColorRes;
    }

    public final int component8() {
        return this.titleColorRes;
    }

    public final int component9() {
        return this.descriptionColorRes;
    }

    @NotNull
    public final SliderPage copy(@Nullable CharSequence charSequence, @Nullable CharSequence charSequence2, @InterfaceC4346u int i10, @InterfaceC4337k int i11, @InterfaceC4337k int i12, @InterfaceC4337k int i13, @InterfaceC4339m int i14, @InterfaceC4339m int i15, @InterfaceC4339m int i16, @InterfaceC4349x int i17, @InterfaceC4349x int i18, @Nullable String str, @Nullable String str2, @InterfaceC4346u int i19) {
        return new SliderPage(charSequence, charSequence2, i10, i11, i12, i13, i14, i15, i16, i17, i18, str, str2, i19);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SliderPage)) {
            return false;
        }
        SliderPage sliderPage = (SliderPage) obj;
        return G.g(this.title, sliderPage.title) && G.g(this.description, sliderPage.description) && this.imageDrawable == sliderPage.imageDrawable && this.backgroundColor == sliderPage.backgroundColor && this.titleColor == sliderPage.titleColor && this.descriptionColor == sliderPage.descriptionColor && this.backgroundColorRes == sliderPage.backgroundColorRes && this.titleColorRes == sliderPage.titleColorRes && this.descriptionColorRes == sliderPage.descriptionColorRes && this.titleTypefaceFontRes == sliderPage.titleTypefaceFontRes && this.descriptionTypefaceFontRes == sliderPage.descriptionTypefaceFontRes && G.g(this.titleTypeface, sliderPage.titleTypeface) && G.g(this.descriptionTypeface, sliderPage.descriptionTypeface) && this.backgroundDrawable == sliderPage.backgroundDrawable;
    }

    public final int getBackgroundColor() {
        return this.backgroundColor;
    }

    public final int getBackgroundColorRes() {
        return this.backgroundColorRes;
    }

    public final int getBackgroundDrawable() {
        return this.backgroundDrawable;
    }

    @Nullable
    public final CharSequence getDescription() {
        return this.description;
    }

    public final int getDescriptionColor() {
        return this.descriptionColor;
    }

    public final int getDescriptionColorRes() {
        return this.descriptionColorRes;
    }

    @Nullable
    public final String getDescriptionString() {
        CharSequence charSequence = this.description;
        if (charSequence == null) {
            return null;
        }
        return charSequence.toString();
    }

    @Nullable
    public final String getDescriptionTypeface() {
        return this.descriptionTypeface;
    }

    public final int getDescriptionTypefaceFontRes() {
        return this.descriptionTypefaceFontRes;
    }

    public final int getImageDrawable() {
        return this.imageDrawable;
    }

    @Nullable
    public final CharSequence getTitle() {
        return this.title;
    }

    public final int getTitleColor() {
        return this.titleColor;
    }

    public final int getTitleColorRes() {
        return this.titleColorRes;
    }

    @Nullable
    public final String getTitleString() {
        CharSequence charSequence = this.title;
        if (charSequence == null) {
            return null;
        }
        return charSequence.toString();
    }

    @Nullable
    public final String getTitleTypeface() {
        return this.titleTypeface;
    }

    public final int getTitleTypefaceFontRes() {
        return this.titleTypefaceFontRes;
    }

    public int hashCode() {
        CharSequence charSequence = this.title;
        int iHashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
        CharSequence charSequence2 = this.description;
        int iHashCode2 = (((((((((((((((((((iHashCode + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31) + this.imageDrawable) * 31) + this.backgroundColor) * 31) + this.titleColor) * 31) + this.descriptionColor) * 31) + this.backgroundColorRes) * 31) + this.titleColorRes) * 31) + this.descriptionColorRes) * 31) + this.titleTypefaceFontRes) * 31) + this.descriptionTypefaceFontRes) * 31;
        String str = this.titleTypeface;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.descriptionTypeface;
        return ((iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.backgroundDrawable;
    }

    public final void setBackgroundColor(int i10) {
        this.backgroundColor = i10;
    }

    public final void setBackgroundColorRes(int i10) {
        this.backgroundColorRes = i10;
    }

    public final void setBackgroundDrawable(int i10) {
        this.backgroundDrawable = i10;
    }

    public final void setDescription(@Nullable CharSequence charSequence) {
        this.description = charSequence;
    }

    public final void setDescriptionColor(int i10) {
        this.descriptionColor = i10;
    }

    public final void setDescriptionColorRes(int i10) {
        this.descriptionColorRes = i10;
    }

    public final void setDescriptionTypeface(@Nullable String str) {
        this.descriptionTypeface = str;
    }

    public final void setDescriptionTypefaceFontRes(int i10) {
        this.descriptionTypefaceFontRes = i10;
    }

    public final void setImageDrawable(int i10) {
        this.imageDrawable = i10;
    }

    public final void setTitle(@Nullable CharSequence charSequence) {
        this.title = charSequence;
    }

    public final void setTitleColor(int i10) {
        this.titleColor = i10;
    }

    public final void setTitleColorRes(int i10) {
        this.titleColorRes = i10;
    }

    public final void setTitleTypeface(@Nullable String str) {
        this.titleTypeface = str;
    }

    public final void setTitleTypefaceFontRes(int i10) {
        this.titleTypefaceFontRes = i10;
    }

    @NotNull
    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putString("title", getTitleString());
        bundle.putString(AppIntroBaseFragmentKt.ARG_TITLE_TYPEFACE, this.titleTypeface);
        bundle.putInt(AppIntroBaseFragmentKt.ARG_TITLE_TYPEFACE_RES, this.titleTypefaceFontRes);
        bundle.putInt(AppIntroBaseFragmentKt.ARG_TITLE_COLOR, this.titleColor);
        bundle.putInt(AppIntroBaseFragmentKt.ARG_TITLE_COLOR_RES, this.titleColorRes);
        bundle.putString("desc", getDescriptionString());
        bundle.putString(AppIntroBaseFragmentKt.ARG_DESC_TYPEFACE, this.descriptionTypeface);
        bundle.putInt(AppIntroBaseFragmentKt.ARG_DESC_TYPEFACE_RES, this.descriptionTypefaceFontRes);
        bundle.putInt(AppIntroBaseFragmentKt.ARG_DESC_COLOR, this.descriptionColor);
        bundle.putInt(AppIntroBaseFragmentKt.ARG_DESC_COLOR_RES, this.descriptionColorRes);
        bundle.putInt(AppIntroBaseFragmentKt.ARG_DRAWABLE, this.imageDrawable);
        bundle.putInt(AppIntroBaseFragmentKt.ARG_BG_COLOR, this.backgroundColor);
        bundle.putInt(AppIntroBaseFragmentKt.ARG_BG_COLOR_RES, this.backgroundColorRes);
        bundle.putInt(AppIntroBaseFragmentKt.ARG_BG_DRAWABLE, this.backgroundDrawable);
        return bundle;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("SliderPage(title=");
        sb2.append((Object) this.title);
        sb2.append(", description=");
        sb2.append((Object) this.description);
        sb2.append(", imageDrawable=");
        sb2.append(this.imageDrawable);
        sb2.append(", backgroundColor=");
        sb2.append(this.backgroundColor);
        sb2.append(", titleColor=");
        sb2.append(this.titleColor);
        sb2.append(", descriptionColor=");
        sb2.append(this.descriptionColor);
        sb2.append(", backgroundColorRes=");
        sb2.append(this.backgroundColorRes);
        sb2.append(", titleColorRes=");
        sb2.append(this.titleColorRes);
        sb2.append(", descriptionColorRes=");
        sb2.append(this.descriptionColorRes);
        sb2.append(", titleTypefaceFontRes=");
        sb2.append(this.titleTypefaceFontRes);
        sb2.append(", descriptionTypefaceFontRes=");
        sb2.append(this.descriptionTypefaceFontRes);
        sb2.append(", titleTypeface=");
        sb2.append((Object) this.titleTypeface);
        sb2.append(", descriptionTypeface=");
        sb2.append((Object) this.descriptionTypeface);
        sb2.append(", backgroundDrawable=");
        return C1477d.a(sb2, this.backgroundDrawable, ')');
    }

    @k
    public SliderPage(@Nullable CharSequence charSequence) {
        this(charSequence, null, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, null, 0, 16382, null);
    }

    @k
    public SliderPage(@Nullable CharSequence charSequence, @Nullable CharSequence charSequence2) {
        this(charSequence, charSequence2, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, null, 0, 16380, null);
    }

    @k
    public SliderPage(@Nullable CharSequence charSequence, @Nullable CharSequence charSequence2, @InterfaceC4346u int i10) {
        this(charSequence, charSequence2, i10, 0, 0, 0, 0, 0, 0, 0, 0, null, null, 0, 16376, null);
    }

    @k
    public SliderPage(@Nullable CharSequence charSequence, @Nullable CharSequence charSequence2, @InterfaceC4346u int i10, @InterfaceC4337k int i11) {
        this(charSequence, charSequence2, i10, i11, 0, 0, 0, 0, 0, 0, 0, null, null, 0, 16368, null);
    }

    @k
    public SliderPage(@Nullable CharSequence charSequence, @Nullable CharSequence charSequence2, @InterfaceC4346u int i10, @InterfaceC4337k int i11, @InterfaceC4337k int i12) {
        this(charSequence, charSequence2, i10, i11, i12, 0, 0, 0, 0, 0, 0, null, null, 0, 16352, null);
    }

    @k
    public SliderPage(@Nullable CharSequence charSequence, @Nullable CharSequence charSequence2, @InterfaceC4346u int i10, @InterfaceC4337k int i11, @InterfaceC4337k int i12, @InterfaceC4337k int i13) {
        this(charSequence, charSequence2, i10, i11, i12, i13, 0, 0, 0, 0, 0, null, null, 0, 16320, null);
    }

    @k
    public SliderPage(@Nullable CharSequence charSequence, @Nullable CharSequence charSequence2, @InterfaceC4346u int i10, @InterfaceC4337k int i11, @InterfaceC4337k int i12, @InterfaceC4337k int i13, @InterfaceC4339m int i14) {
        this(charSequence, charSequence2, i10, i11, i12, i13, i14, 0, 0, 0, 0, null, null, 0, 16256, null);
    }

    @k
    public SliderPage(@Nullable CharSequence charSequence, @Nullable CharSequence charSequence2, @InterfaceC4346u int i10, @InterfaceC4337k int i11, @InterfaceC4337k int i12, @InterfaceC4337k int i13, @InterfaceC4339m int i14, @InterfaceC4339m int i15) {
        this(charSequence, charSequence2, i10, i11, i12, i13, i14, i15, 0, 0, 0, null, null, 0, 16128, null);
    }

    @k
    public SliderPage(@Nullable CharSequence charSequence, @Nullable CharSequence charSequence2, @InterfaceC4346u int i10, @InterfaceC4337k int i11, @InterfaceC4337k int i12, @InterfaceC4337k int i13, @InterfaceC4339m int i14, @InterfaceC4339m int i15, @InterfaceC4339m int i16) {
        this(charSequence, charSequence2, i10, i11, i12, i13, i14, i15, i16, 0, 0, null, null, 0, 15872, null);
    }

    @k
    public SliderPage(@Nullable CharSequence charSequence, @Nullable CharSequence charSequence2, @InterfaceC4346u int i10, @InterfaceC4337k int i11, @InterfaceC4337k int i12, @InterfaceC4337k int i13, @InterfaceC4339m int i14, @InterfaceC4339m int i15, @InterfaceC4339m int i16, @InterfaceC4349x int i17) {
        this(charSequence, charSequence2, i10, i11, i12, i13, i14, i15, i16, i17, 0, null, null, 0, 15360, null);
    }

    @k
    public SliderPage(@Nullable CharSequence charSequence, @Nullable CharSequence charSequence2, @InterfaceC4346u int i10, @InterfaceC4337k int i11, @InterfaceC4337k int i12, @InterfaceC4337k int i13, @InterfaceC4339m int i14, @InterfaceC4339m int i15, @InterfaceC4339m int i16, @InterfaceC4349x int i17, @InterfaceC4349x int i18) {
        this(charSequence, charSequence2, i10, i11, i12, i13, i14, i15, i16, i17, i18, null, null, 0, 14336, null);
    }

    @k
    public SliderPage(@Nullable CharSequence charSequence, @Nullable CharSequence charSequence2, @InterfaceC4346u int i10, @InterfaceC4337k int i11, @InterfaceC4337k int i12, @InterfaceC4337k int i13, @InterfaceC4339m int i14, @InterfaceC4339m int i15, @InterfaceC4339m int i16, @InterfaceC4349x int i17, @InterfaceC4349x int i18, @Nullable String str) {
        this(charSequence, charSequence2, i10, i11, i12, i13, i14, i15, i16, i17, i18, str, null, 0, 12288, null);
    }

    @k
    public SliderPage(@Nullable CharSequence charSequence, @Nullable CharSequence charSequence2, @InterfaceC4346u int i10, @InterfaceC4337k int i11, @InterfaceC4337k int i12, @InterfaceC4337k int i13, @InterfaceC4339m int i14, @InterfaceC4339m int i15, @InterfaceC4339m int i16, @InterfaceC4349x int i17, @InterfaceC4349x int i18, @Nullable String str, @Nullable String str2) {
        this(charSequence, charSequence2, i10, i11, i12, i13, i14, i15, i16, i17, i18, str, str2, 0, 8192, null);
    }

    @k
    public SliderPage(@Nullable CharSequence charSequence, @Nullable CharSequence charSequence2, @InterfaceC4346u int i10, @InterfaceC4337k int i11, @InterfaceC4337k int i12, @InterfaceC4337k int i13, @InterfaceC4339m int i14, @InterfaceC4339m int i15, @InterfaceC4339m int i16, @InterfaceC4349x int i17, @InterfaceC4349x int i18, @Nullable String str, @Nullable String str2, @InterfaceC4346u int i19) {
        this.title = charSequence;
        this.description = charSequence2;
        this.imageDrawable = i10;
        this.backgroundColor = i11;
        this.titleColor = i12;
        this.descriptionColor = i13;
        this.backgroundColorRes = i14;
        this.titleColorRes = i15;
        this.descriptionColorRes = i16;
        this.titleTypefaceFontRes = i17;
        this.descriptionTypefaceFontRes = i18;
        this.titleTypeface = str;
        this.descriptionTypeface = str2;
        this.backgroundDrawable = i19;
    }

    public /* synthetic */ SliderPage(CharSequence charSequence, CharSequence charSequence2, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, String str, String str2, int i19, int i20, C4969v c4969v) {
        this((i20 & 1) != 0 ? null : charSequence, (i20 & 2) != 0 ? null : charSequence2, (i20 & 4) != 0 ? 0 : i10, (i20 & 8) != 0 ? 0 : i11, (i20 & 16) != 0 ? 0 : i12, (i20 & 32) != 0 ? 0 : i13, (i20 & 64) != 0 ? 0 : i14, (i20 & 128) != 0 ? 0 : i15, (i20 & 256) != 0 ? 0 : i16, (i20 & 512) != 0 ? 0 : i17, (i20 & 1024) != 0 ? 0 : i18, (i20 & 2048) != 0 ? null : str, (i20 & 4096) == 0 ? str2 : null, (i20 & 8192) != 0 ? 0 : i19);
    }
}
