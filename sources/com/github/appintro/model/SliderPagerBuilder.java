package com.github.appintro.model;

import e.InterfaceC4337k;
import e.InterfaceC4339m;
import e.InterfaceC4346u;
import e.InterfaceC4349x;
import kotlin.InterfaceC4852c0;
import kotlin.InterfaceC4982o;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class SliderPagerBuilder {

    @InterfaceC4337k
    private int backgroundColor;

    @InterfaceC4339m
    private int backgroundColorRes;

    @InterfaceC4346u
    private int backgroundDrawable;

    @Nullable
    private CharSequence description;

    @InterfaceC4337k
    private int descriptionColor;

    @InterfaceC4339m
    private int descriptionColorRes;

    @Nullable
    private String descriptionTypeface;

    @InterfaceC4349x
    private int descriptionTypefaceFontRes;

    @InterfaceC4346u
    private int imageDrawable;

    @Nullable
    private CharSequence title;

    @InterfaceC4337k
    private int titleColor;

    @InterfaceC4339m
    private int titleColorRes;

    @Nullable
    private String titleTypeface;

    @InterfaceC4349x
    private int titleTypefaceFontRes;

    @InterfaceC4982o(message = "`backgroundColor(...)` has been deprecated to support configuration changes", replaceWith = @InterfaceC4852c0(expression = "backgroundColorRes(backgroundColor)", imports = {}))
    @NotNull
    public final SliderPagerBuilder backgroundColor(@InterfaceC4337k int i10) {
        this.backgroundColor = i10;
        return this;
    }

    @NotNull
    public final SliderPagerBuilder backgroundColorRes(@InterfaceC4339m int i10) {
        this.backgroundColorRes = i10;
        return this;
    }

    @NotNull
    public final SliderPagerBuilder backgroundDrawable(@InterfaceC4346u int i10) {
        this.backgroundDrawable = i10;
        return this;
    }

    @NotNull
    public final SliderPage build() {
        CharSequence charSequence = this.title;
        CharSequence charSequence2 = this.description;
        int i10 = this.imageDrawable;
        int i11 = this.backgroundColor;
        int i12 = this.backgroundColorRes;
        int i13 = this.titleColor;
        int i14 = this.titleColorRes;
        int i15 = this.descriptionColor;
        int i16 = this.descriptionColorRes;
        int i17 = this.titleTypefaceFontRes;
        String str = this.descriptionTypeface;
        return new SliderPage(charSequence, charSequence2, i10, i11, i13, i15, i12, i14, i16, i17, this.descriptionTypefaceFontRes, this.titleTypeface, str, this.backgroundDrawable);
    }

    @NotNull
    public final SliderPagerBuilder description(@NotNull CharSequence description) {
        G.p(description, "description");
        this.description = description;
        return this;
    }

    @InterfaceC4982o(message = "`descriptionColor(...)` has been deprecated to support configuration changes", replaceWith = @InterfaceC4852c0(expression = "descriptionColorRes(descriptionColor)", imports = {}))
    @NotNull
    public final SliderPagerBuilder descriptionColor(@InterfaceC4337k int i10) {
        this.descriptionColor = i10;
        return this;
    }

    @NotNull
    public final SliderPagerBuilder descriptionColorRes(@InterfaceC4339m int i10) {
        this.descriptionColorRes = i10;
        return this;
    }

    @NotNull
    public final SliderPagerBuilder descriptionTypeface(@NotNull String descriptionTypeface) {
        G.p(descriptionTypeface, "descriptionTypeface");
        this.descriptionTypeface = descriptionTypeface;
        return this;
    }

    @NotNull
    public final SliderPagerBuilder descriptionTypefaceFontRes(@InterfaceC4349x int i10) {
        this.descriptionTypefaceFontRes = i10;
        return this;
    }

    @NotNull
    public final SliderPagerBuilder imageDrawable(@InterfaceC4346u int i10) {
        this.imageDrawable = i10;
        return this;
    }

    @NotNull
    public final SliderPagerBuilder title(@NotNull CharSequence title) {
        G.p(title, "title");
        this.title = title;
        return this;
    }

    @InterfaceC4982o(message = "`titleColor(...)` has been deprecated to support configuration changes", replaceWith = @InterfaceC4852c0(expression = "titleColorRes(titleColor)", imports = {}))
    @NotNull
    public final SliderPagerBuilder titleColor(@InterfaceC4337k int i10) {
        this.titleColor = i10;
        return this;
    }

    @NotNull
    public final SliderPagerBuilder titleColorRes(@InterfaceC4339m int i10) {
        this.titleColorRes = i10;
        return this;
    }

    @NotNull
    public final SliderPagerBuilder titleTypeface(@NotNull String titleTypeface) {
        G.p(titleTypeface, "titleTypeface");
        this.titleTypeface = titleTypeface;
        return this;
    }

    @NotNull
    public final SliderPagerBuilder titleTypefaceFontRes(@InterfaceC4349x int i10) {
        this.titleTypefaceFontRes = i10;
        return this;
    }
}
