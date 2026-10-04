package com.mbridge.msdk.dycreator.wrapper;

import com.mbridge.msdk.dycreator.listener.DyCountDownListenerWrapper;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.File;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class DyOption {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<String> f155864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private File f155865b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private CampaignEx f155866c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private DyAdType f155867d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f155868e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f155869f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f155870g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f155871h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f155872i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f155873j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f155874k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f155875l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f155876m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f155877n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f155878o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f155879p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f155880q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private DyCountDownListenerWrapper f155881r;

    public static class Builder implements IViewOptionBuilder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private List<String> f155882a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private File f155883b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private CampaignEx f155884c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private DyAdType f155885d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f155886e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private String f155887f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f155888g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f155889h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f155890i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private boolean f155891j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private boolean f155892k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f155893l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f155894m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private int f155895n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private int f155896o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private int f155897p;

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder adChoiceLink(String str) {
            this.f155887f = str;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public DyOption build() {
            return new DyOption(this);
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder campaignEx(CampaignEx campaignEx) {
            this.f155884c = campaignEx;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder canSkip(boolean z10) {
            this.f155886e = z10;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder countDownTime(int i10) {
            this.f155896o = i10;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder dyAdType(DyAdType dyAdType) {
            this.f155885d = dyAdType;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder file(File file) {
            this.f155883b = file;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder fileDirs(List<String> list) {
            this.f155882a = list;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder isApkInfoVisible(boolean z10) {
            this.f155891j = z10;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder isClickButtonVisible(boolean z10) {
            this.f155889h = z10;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder isLogoVisible(boolean z10) {
            this.f155892k = z10;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder isScreenClick(boolean z10) {
            this.f155888g = z10;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder isShakeVisible(boolean z10) {
            this.f155890i = z10;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder orientation(int i10) {
            this.f155895n = i10;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder shakeStrenght(int i10) {
            this.f155893l = i10;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder shakeTime(int i10) {
            this.f155894m = i10;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder templateType(int i10) {
            this.f155897p = i10;
            return this;
        }
    }

    public interface IViewOptionBuilder {
        IViewOptionBuilder adChoiceLink(String str);

        DyOption build();

        IViewOptionBuilder campaignEx(CampaignEx campaignEx);

        IViewOptionBuilder canSkip(boolean z10);

        IViewOptionBuilder countDownTime(int i10);

        IViewOptionBuilder dyAdType(DyAdType dyAdType);

        IViewOptionBuilder file(File file);

        IViewOptionBuilder fileDirs(List<String> list);

        IViewOptionBuilder isApkInfoVisible(boolean z10);

        IViewOptionBuilder isClickButtonVisible(boolean z10);

        IViewOptionBuilder isLogoVisible(boolean z10);

        IViewOptionBuilder isScreenClick(boolean z10);

        IViewOptionBuilder isShakeVisible(boolean z10);

        IViewOptionBuilder orientation(int i10);

        IViewOptionBuilder shakeStrenght(int i10);

        IViewOptionBuilder shakeTime(int i10);

        IViewOptionBuilder templateType(int i10);
    }

    public DyOption(Builder builder) {
        this.f155864a = builder.f155882a;
        this.f155865b = builder.f155883b;
        this.f155866c = builder.f155884c;
        this.f155867d = builder.f155885d;
        this.f155870g = builder.f155886e;
        this.f155868e = builder.f155887f;
        this.f155869f = builder.f155888g;
        this.f155871h = builder.f155889h;
        this.f155873j = builder.f155891j;
        this.f155872i = builder.f155890i;
        this.f155874k = builder.f155892k;
        this.f155875l = builder.f155893l;
        this.f155876m = builder.f155894m;
        this.f155877n = builder.f155895n;
        this.f155878o = builder.f155896o;
        this.f155880q = builder.f155897p;
    }

    public String getAdChoiceLink() {
        return this.f155868e;
    }

    public CampaignEx getCampaignEx() {
        return this.f155866c;
    }

    public int getCountDownTime() {
        return this.f155878o;
    }

    public int getCurrentCountDown() {
        return this.f155879p;
    }

    public DyAdType getDyAdType() {
        return this.f155867d;
    }

    public File getFile() {
        return this.f155865b;
    }

    public List<String> getFileDirs() {
        return this.f155864a;
    }

    public int getOrientation() {
        return this.f155877n;
    }

    public int getShakeStrenght() {
        return this.f155875l;
    }

    public int getShakeTime() {
        return this.f155876m;
    }

    public int getTemplateType() {
        return this.f155880q;
    }

    public boolean isApkInfoVisible() {
        return this.f155873j;
    }

    public boolean isCanSkip() {
        return this.f155870g;
    }

    public boolean isClickButtonVisible() {
        return this.f155871h;
    }

    public boolean isClickScreen() {
        return this.f155869f;
    }

    public boolean isLogoVisible() {
        return this.f155874k;
    }

    public boolean isShakeVisible() {
        return this.f155872i;
    }

    public void setDyCountDownListener(int i10) {
        DyCountDownListenerWrapper dyCountDownListenerWrapper = this.f155881r;
        if (dyCountDownListenerWrapper != null) {
            dyCountDownListenerWrapper.getCountDownValue(i10);
        }
        this.f155879p = i10;
    }

    public void setDyCountDownListenerWrapper(DyCountDownListenerWrapper dyCountDownListenerWrapper) {
        this.f155881r = dyCountDownListenerWrapper;
    }
}
