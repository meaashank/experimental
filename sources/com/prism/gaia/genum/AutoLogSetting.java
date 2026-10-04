package com.prism.gaia.genum;

import c7.m;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AutoLogSetting {
    private static final /* synthetic */ AutoLogSetting[] $VALUES = $values();
    public static final AutoLogSetting AlWAYS_ON;
    public static final AutoLogSetting OFF;
    public static final AutoLogSetting PROXIED_ON;

    /* JADX INFO: renamed from: com.prism.gaia.genum.AutoLogSetting$1, reason: invalid class name */
    public enum AnonymousClass1 extends AutoLogSetting {
        @Override // com.prism.gaia.genum.AutoLogSetting
        public boolean shouldLog(m mVar) {
            return false;
        }

        private AnonymousClass1(String str, int i10) {
            super(str, i10);
        }
    }

    /* JADX INFO: renamed from: com.prism.gaia.genum.AutoLogSetting$2, reason: invalid class name */
    public enum AnonymousClass2 extends AutoLogSetting {
        @Override // com.prism.gaia.genum.AutoLogSetting
        public boolean shouldLog(m mVar) {
            return false;
        }

        private AnonymousClass2(String str, int i10) {
            super(str, i10);
        }
    }

    /* JADX INFO: renamed from: com.prism.gaia.genum.AutoLogSetting$3, reason: invalid class name */
    public enum AnonymousClass3 extends AutoLogSetting {
        @Override // com.prism.gaia.genum.AutoLogSetting
        public boolean shouldLog(m mVar) {
            if (mVar == null) {
                return false;
            }
            mVar.P();
            return false;
        }

        private AnonymousClass3(String str, int i10) {
            super(str, i10);
        }
    }

    private static /* synthetic */ AutoLogSetting[] $values() {
        return new AutoLogSetting[]{OFF, AlWAYS_ON, PROXIED_ON};
    }

    static {
        OFF = new AnonymousClass1("OFF", 0);
        AlWAYS_ON = new AnonymousClass2("AlWAYS_ON", 1);
        PROXIED_ON = new AnonymousClass3("PROXIED_ON", 2);
    }

    public static AutoLogSetting valueOf(String str) {
        return (AutoLogSetting) Enum.valueOf(AutoLogSetting.class, str);
    }

    public static AutoLogSetting[] values() {
        return (AutoLogSetting[]) $VALUES.clone();
    }

    public abstract boolean shouldLog(m mVar);

    private AutoLogSetting(String str, int i10) {
    }
}
