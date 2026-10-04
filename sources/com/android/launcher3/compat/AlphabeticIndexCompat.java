package com.android.launcher3.compat;

import android.annotation.TargetApi;
import android.content.Context;
import android.icu.text.AlphabeticIndex;
import android.os.LocaleList;
import android.util.Log;
import com.android.launcher3.Utilities;
import java.lang.reflect.Method;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public class AlphabeticIndexCompat {
    private static final String MID_DOT = "∙";
    private static final String TAG = "AlphabeticIndexCompat";
    private final BaseIndex mBaseIndex;
    private final String mDefaultMiscLabel;

    public static class AlphabeticIndexV16 extends BaseIndex {
        private Object mAlphabeticIndex;
        private Method mGetBucketIndexMethod;
        private Method mGetBucketLabelMethod;

        public AlphabeticIndexV16(Context context) throws Exception {
            super();
            Locale locale = context.getResources().getConfiguration().locale;
            Class<?> cls = Class.forName("libcore.icu.AlphabeticIndex");
            this.mGetBucketIndexMethod = cls.getDeclaredMethod("getBucketIndex", String.class);
            this.mGetBucketLabelMethod = cls.getDeclaredMethod("getBucketLabel", Integer.TYPE);
            this.mAlphabeticIndex = cls.getConstructor(Locale.class).newInstance(locale);
            String language = locale.getLanguage();
            Locale locale2 = Locale.ENGLISH;
            if (language.equals(locale2.getLanguage())) {
                return;
            }
            cls.getDeclaredMethod("addLabels", Locale.class).invoke(this.mAlphabeticIndex, locale2);
        }

        @Override // com.android.launcher3.compat.AlphabeticIndexCompat.BaseIndex
        public int getBucketIndex(String str) {
            try {
                return ((Integer) this.mGetBucketIndexMethod.invoke(this.mAlphabeticIndex, str)).intValue();
            } catch (Exception e10) {
                e10.printStackTrace();
                return super.getBucketIndex(str);
            }
        }

        @Override // com.android.launcher3.compat.AlphabeticIndexCompat.BaseIndex
        public String getBucketLabel(int i10) {
            try {
                return (String) this.mGetBucketLabelMethod.invoke(this.mAlphabeticIndex, Integer.valueOf(i10));
            } catch (Exception e10) {
                e10.printStackTrace();
                return super.getBucketLabel(i10);
            }
        }
    }

    @TargetApi(24)
    public static class AlphabeticIndexVN extends BaseIndex {
        private final AlphabeticIndex.ImmutableIndex mAlphabeticIndex;

        public AlphabeticIndexVN(Context context) {
            super();
            LocaleList locales = context.getResources().getConfiguration().getLocales();
            int size = locales.size();
            AlphabeticIndex alphabeticIndexA = f.a(size == 0 ? Locale.ENGLISH : locales.get(0));
            for (int i10 = 1; i10 < size; i10++) {
                alphabeticIndexA.addLabels(locales.get(i10));
            }
            alphabeticIndexA.addLabels(Locale.ENGLISH);
            this.mAlphabeticIndex = alphabeticIndexA.buildImmutableIndex();
        }

        @Override // com.android.launcher3.compat.AlphabeticIndexCompat.BaseIndex
        public int getBucketIndex(String str) {
            return this.mAlphabeticIndex.getBucketIndex(str);
        }

        @Override // com.android.launcher3.compat.AlphabeticIndexCompat.BaseIndex
        public String getBucketLabel(int i10) {
            return this.mAlphabeticIndex.getBucket(i10).getLabel();
        }
    }

    public static class BaseIndex {
        private static final String BUCKETS = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-";
        private static final int UNKNOWN_BUCKET_INDEX = 36;

        public int getBucketIndex(String str) {
            if (str.isEmpty()) {
                return UNKNOWN_BUCKET_INDEX;
            }
            int iIndexOf = BUCKETS.indexOf(str.substring(0, 1).toUpperCase());
            return iIndexOf != -1 ? iIndexOf : UNKNOWN_BUCKET_INDEX;
        }

        public String getBucketLabel(int i10) {
            return BUCKETS.substring(i10, i10 + 1);
        }

        private BaseIndex() {
        }
    }

    public AlphabeticIndexCompat(Context context) {
        try {
        } catch (Exception e10) {
            Log.d(TAG, "Unable to load the system index", e10);
        }
        BaseIndex alphabeticIndexVN = Utilities.ATLEAST_NOUGAT ? new AlphabeticIndexVN(context) : null;
        if (alphabeticIndexVN == null) {
            try {
                alphabeticIndexVN = new AlphabeticIndexV16(context);
            } catch (Exception e11) {
                Log.d(TAG, "Unable to load the system index", e11);
            }
        }
        this.mBaseIndex = alphabeticIndexVN == null ? new BaseIndex() : alphabeticIndexVN;
        if (context.getResources().getConfiguration().locale.getLanguage().equals(Locale.JAPANESE.getLanguage())) {
            this.mDefaultMiscLabel = "他";
        } else {
            this.mDefaultMiscLabel = MID_DOT;
        }
    }

    public String computeSectionName(CharSequence charSequence) {
        String strTrim = Utilities.trim(charSequence);
        BaseIndex baseIndex = this.mBaseIndex;
        String bucketLabel = baseIndex.getBucketLabel(baseIndex.getBucketIndex(strTrim));
        if (!Utilities.trim(bucketLabel).isEmpty() || strTrim.length() <= 0) {
            return bucketLabel;
        }
        int iCodePointAt = strTrim.codePointAt(0);
        return Character.isDigit(iCodePointAt) ? "#" : Character.isLetter(iCodePointAt) ? this.mDefaultMiscLabel : MID_DOT;
    }
}
