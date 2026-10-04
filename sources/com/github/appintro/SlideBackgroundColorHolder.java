package com.github.appintro;

import e.InterfaceC4337k;
import e.InterfaceC4339m;
import kotlin.InterfaceC4852c0;
import kotlin.InterfaceC4982o;

/* JADX INFO: loaded from: classes3.dex */
public interface SlideBackgroundColorHolder {

    public static final class DefaultImpls {
        @InterfaceC4982o(message = "`defaultBackgroundColor` has been deprecated to support configuration changes", replaceWith = @InterfaceC4852c0(expression = "defaultBackgroundColorRes", imports = {}))
        public static /* synthetic */ void getDefaultBackgroundColor$annotations() {
        }
    }

    @InterfaceC4337k
    int getDefaultBackgroundColor();

    @InterfaceC4339m
    int getDefaultBackgroundColorRes();

    void setBackgroundColor(@InterfaceC4337k int i10);
}
