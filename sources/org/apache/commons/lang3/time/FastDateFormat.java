package org.apache.commons.lang3.time;

import android.support.v4.media.e;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.text.DateFormatSymbols;
import java.text.FieldPosition;
import java.text.Format;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.apache.commons.lang3.Validate;
import org.objectweb.asm.signature.SignatureVisitor;

/* JADX INFO: loaded from: classes6.dex */
public class FastDateFormat extends Format {
    public static final int FULL = 0;
    public static final int LONG = 1;
    public static final int MEDIUM = 2;
    public static final int SHORT = 3;
    private static final long serialVersionUID = 1;
    private final Locale mLocale;
    private transient int mMaxLengthEstimate;
    private final String mPattern;
    private transient Rule[] mRules;
    private final TimeZone mTimeZone;
    private static final FormatCache<FastDateFormat> cache = new FormatCache<FastDateFormat>() { // from class: org.apache.commons.lang3.time.FastDateFormat.1
        @Override // org.apache.commons.lang3.time.FormatCache
        public FastDateFormat createInstance(String str, TimeZone timeZone, Locale locale) {
            return new FastDateFormat(str, timeZone, locale);
        }
    };
    private static ConcurrentMap<TimeZoneDisplayKey, String> cTimeZoneDisplayCache = new ConcurrentHashMap(7);

    public static class CharacterLiteral implements Rule {
        private final char mValue;

        public CharacterLiteral(char c10) {
            this.mValue = c10;
        }

        @Override // org.apache.commons.lang3.time.FastDateFormat.Rule
        public void appendTo(StringBuffer stringBuffer, Calendar calendar) {
            stringBuffer.append(this.mValue);
        }

        @Override // org.apache.commons.lang3.time.FastDateFormat.Rule
        public int estimateLength() {
            return 1;
        }
    }

    public interface NumberRule extends Rule {
        void appendTo(StringBuffer stringBuffer, int i10);
    }

    public static class PaddedNumberField implements NumberRule {
        private final int mField;
        private final int mSize;

        public PaddedNumberField(int i10, int i11) {
            if (i11 < 3) {
                throw new IllegalArgumentException();
            }
            this.mField = i10;
            this.mSize = i11;
        }

        @Override // org.apache.commons.lang3.time.FastDateFormat.Rule
        public void appendTo(StringBuffer stringBuffer, Calendar calendar) {
            appendTo(stringBuffer, calendar.get(this.mField));
        }

        @Override // org.apache.commons.lang3.time.FastDateFormat.Rule
        public int estimateLength() {
            return 4;
        }

        @Override // org.apache.commons.lang3.time.FastDateFormat.NumberRule
        public final void appendTo(StringBuffer stringBuffer, int i10) {
            int length;
            if (i10 < 100) {
                int i11 = this.mSize;
                while (true) {
                    i11--;
                    if (i11 < 2) {
                        stringBuffer.append((char) ((i10 / 10) + 48));
                        stringBuffer.append((char) ((i10 % 10) + 48));
                        return;
                    }
                    stringBuffer.append('0');
                }
            } else {
                if (i10 < 1000) {
                    length = 3;
                } else {
                    Validate.isTrue(i10 > -1, "Negative values should not be possible", i10);
                    length = Integer.toString(i10).length();
                }
                int i12 = this.mSize;
                while (true) {
                    i12--;
                    if (i12 < length) {
                        stringBuffer.append(Integer.toString(i10));
                        return;
                    }
                    stringBuffer.append('0');
                }
            }
        }
    }

    public interface Rule {
        void appendTo(StringBuffer stringBuffer, Calendar calendar);

        int estimateLength();
    }

    public static class StringLiteral implements Rule {
        private final String mValue;

        public StringLiteral(String str) {
            this.mValue = str;
        }

        @Override // org.apache.commons.lang3.time.FastDateFormat.Rule
        public void appendTo(StringBuffer stringBuffer, Calendar calendar) {
            stringBuffer.append(this.mValue);
        }

        @Override // org.apache.commons.lang3.time.FastDateFormat.Rule
        public int estimateLength() {
            return this.mValue.length();
        }
    }

    public static class TextField implements Rule {
        private final int mField;
        private final String[] mValues;

        public TextField(int i10, String[] strArr) {
            this.mField = i10;
            this.mValues = strArr;
        }

        @Override // org.apache.commons.lang3.time.FastDateFormat.Rule
        public void appendTo(StringBuffer stringBuffer, Calendar calendar) {
            stringBuffer.append(this.mValues[calendar.get(this.mField)]);
        }

        @Override // org.apache.commons.lang3.time.FastDateFormat.Rule
        public int estimateLength() {
            int length = this.mValues.length;
            int i10 = 0;
            while (true) {
                length--;
                if (length < 0) {
                    return i10;
                }
                int length2 = this.mValues[length].length();
                if (length2 > i10) {
                    i10 = length2;
                }
            }
        }
    }

    public static class TimeZoneDisplayKey {
        private final Locale mLocale;
        private final int mStyle;
        private final TimeZone mTimeZone;

        public TimeZoneDisplayKey(TimeZone timeZone, boolean z10, int i10, Locale locale) {
            this.mTimeZone = timeZone;
            this.mStyle = z10 ? i10 | Integer.MIN_VALUE : i10;
            this.mLocale = locale;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof TimeZoneDisplayKey) {
                TimeZoneDisplayKey timeZoneDisplayKey = (TimeZoneDisplayKey) obj;
                if (this.mTimeZone.equals(timeZoneDisplayKey.mTimeZone) && this.mStyle == timeZoneDisplayKey.mStyle && this.mLocale.equals(timeZoneDisplayKey.mLocale)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return this.mTimeZone.hashCode() + ((this.mLocale.hashCode() + (this.mStyle * 31)) * 31);
        }
    }

    public static class TimeZoneNameRule implements Rule {
        private final String mDaylight;
        private final String mStandard;
        private final TimeZone mTimeZone;

        public TimeZoneNameRule(TimeZone timeZone, Locale locale, int i10) {
            this.mTimeZone = timeZone;
            this.mStandard = FastDateFormat.getTimeZoneDisplay(timeZone, false, i10, locale);
            this.mDaylight = FastDateFormat.getTimeZoneDisplay(timeZone, true, i10, locale);
        }

        @Override // org.apache.commons.lang3.time.FastDateFormat.Rule
        public void appendTo(StringBuffer stringBuffer, Calendar calendar) {
            if (!this.mTimeZone.useDaylightTime() || calendar.get(16) == 0) {
                stringBuffer.append(this.mStandard);
            } else {
                stringBuffer.append(this.mDaylight);
            }
        }

        @Override // org.apache.commons.lang3.time.FastDateFormat.Rule
        public int estimateLength() {
            return Math.max(this.mStandard.length(), this.mDaylight.length());
        }
    }

    public static class TimeZoneNumberRule implements Rule {
        static final TimeZoneNumberRule INSTANCE_COLON = new TimeZoneNumberRule(true);
        static final TimeZoneNumberRule INSTANCE_NO_COLON = new TimeZoneNumberRule(false);
        final boolean mColon;

        public TimeZoneNumberRule(boolean z10) {
            this.mColon = z10;
        }

        @Override // org.apache.commons.lang3.time.FastDateFormat.Rule
        public void appendTo(StringBuffer stringBuffer, Calendar calendar) {
            int i10 = calendar.get(16) + calendar.get(15);
            if (i10 < 0) {
                stringBuffer.append(SignatureVisitor.SUPER);
                i10 = -i10;
            } else {
                stringBuffer.append(SignatureVisitor.EXTENDS);
            }
            int i11 = i10 / 3600000;
            stringBuffer.append((char) ((i11 / 10) + 48));
            stringBuffer.append((char) ((i11 % 10) + 48));
            if (this.mColon) {
                stringBuffer.append(':');
            }
            int i12 = (i10 / 60000) - (i11 * 60);
            stringBuffer.append((char) ((i12 / 10) + 48));
            stringBuffer.append((char) ((i12 % 10) + 48));
        }

        @Override // org.apache.commons.lang3.time.FastDateFormat.Rule
        public int estimateLength() {
            return 5;
        }
    }

    public static class TwoDigitMonthField implements NumberRule {
        static final TwoDigitMonthField INSTANCE = new TwoDigitMonthField();

        @Override // org.apache.commons.lang3.time.FastDateFormat.Rule
        public void appendTo(StringBuffer stringBuffer, Calendar calendar) {
            appendTo(stringBuffer, calendar.get(2) + 1);
        }

        @Override // org.apache.commons.lang3.time.FastDateFormat.Rule
        public int estimateLength() {
            return 2;
        }

        @Override // org.apache.commons.lang3.time.FastDateFormat.NumberRule
        public final void appendTo(StringBuffer stringBuffer, int i10) {
            stringBuffer.append((char) ((i10 / 10) + 48));
            stringBuffer.append((char) ((i10 % 10) + 48));
        }
    }

    public static class TwoDigitNumberField implements NumberRule {
        private final int mField;

        public TwoDigitNumberField(int i10) {
            this.mField = i10;
        }

        @Override // org.apache.commons.lang3.time.FastDateFormat.Rule
        public void appendTo(StringBuffer stringBuffer, Calendar calendar) {
            appendTo(stringBuffer, calendar.get(this.mField));
        }

        @Override // org.apache.commons.lang3.time.FastDateFormat.Rule
        public int estimateLength() {
            return 2;
        }

        @Override // org.apache.commons.lang3.time.FastDateFormat.NumberRule
        public final void appendTo(StringBuffer stringBuffer, int i10) {
            if (i10 >= 100) {
                stringBuffer.append(Integer.toString(i10));
            } else {
                stringBuffer.append((char) ((i10 / 10) + 48));
                stringBuffer.append((char) ((i10 % 10) + 48));
            }
        }
    }

    public static class TwoDigitYearField implements NumberRule {
        static final TwoDigitYearField INSTANCE = new TwoDigitYearField();

        @Override // org.apache.commons.lang3.time.FastDateFormat.Rule
        public void appendTo(StringBuffer stringBuffer, Calendar calendar) {
            appendTo(stringBuffer, calendar.get(1) % 100);
        }

        @Override // org.apache.commons.lang3.time.FastDateFormat.Rule
        public int estimateLength() {
            return 2;
        }

        @Override // org.apache.commons.lang3.time.FastDateFormat.NumberRule
        public final void appendTo(StringBuffer stringBuffer, int i10) {
            stringBuffer.append((char) ((i10 / 10) + 48));
            stringBuffer.append((char) ((i10 % 10) + 48));
        }
    }

    public static class UnpaddedMonthField implements NumberRule {
        static final UnpaddedMonthField INSTANCE = new UnpaddedMonthField();

        @Override // org.apache.commons.lang3.time.FastDateFormat.Rule
        public void appendTo(StringBuffer stringBuffer, Calendar calendar) {
            appendTo(stringBuffer, calendar.get(2) + 1);
        }

        @Override // org.apache.commons.lang3.time.FastDateFormat.Rule
        public int estimateLength() {
            return 2;
        }

        @Override // org.apache.commons.lang3.time.FastDateFormat.NumberRule
        public final void appendTo(StringBuffer stringBuffer, int i10) {
            if (i10 < 10) {
                stringBuffer.append((char) (i10 + 48));
            } else {
                stringBuffer.append((char) ((i10 / 10) + 48));
                stringBuffer.append((char) ((i10 % 10) + 48));
            }
        }
    }

    public static class UnpaddedNumberField implements NumberRule {
        private final int mField;

        public UnpaddedNumberField(int i10) {
            this.mField = i10;
        }

        @Override // org.apache.commons.lang3.time.FastDateFormat.Rule
        public void appendTo(StringBuffer stringBuffer, Calendar calendar) {
            appendTo(stringBuffer, calendar.get(this.mField));
        }

        @Override // org.apache.commons.lang3.time.FastDateFormat.Rule
        public int estimateLength() {
            return 4;
        }

        @Override // org.apache.commons.lang3.time.FastDateFormat.NumberRule
        public final void appendTo(StringBuffer stringBuffer, int i10) {
            if (i10 < 10) {
                stringBuffer.append((char) (i10 + 48));
            } else if (i10 >= 100) {
                stringBuffer.append(Integer.toString(i10));
            } else {
                stringBuffer.append((char) ((i10 / 10) + 48));
                stringBuffer.append((char) ((i10 % 10) + 48));
            }
        }
    }

    public FastDateFormat(String str, TimeZone timeZone, Locale locale) {
        this.mPattern = str;
        this.mTimeZone = timeZone;
        this.mLocale = locale;
        init();
    }

    public static FastDateFormat getDateInstance(int i10) {
        return (FastDateFormat) cache.getDateTimeInstance(Integer.valueOf(i10), null, null, null);
    }

    public static FastDateFormat getDateTimeInstance(int i10, int i11) {
        return (FastDateFormat) cache.getDateTimeInstance(Integer.valueOf(i10), Integer.valueOf(i11), null, null);
    }

    public static FastDateFormat getInstance() {
        return (FastDateFormat) cache.getDateTimeInstance(3, 3, null, null);
    }

    public static FastDateFormat getTimeInstance(int i10) {
        return (FastDateFormat) cache.getDateTimeInstance(null, Integer.valueOf(i10), null, null);
    }

    public static String getTimeZoneDisplay(TimeZone timeZone, boolean z10, int i10, Locale locale) {
        TimeZoneDisplayKey timeZoneDisplayKey = new TimeZoneDisplayKey(timeZone, z10, i10, locale);
        String str = cTimeZoneDisplayCache.get(timeZoneDisplayKey);
        if (str != null) {
            return str;
        }
        String displayName = timeZone.getDisplayName(z10, i10, locale);
        String strPutIfAbsent = cTimeZoneDisplayCache.putIfAbsent(timeZoneDisplayKey, displayName);
        return strPutIfAbsent != null ? strPutIfAbsent : displayName;
    }

    private void init() {
        List<Rule> pattern = parsePattern();
        Rule[] ruleArr = (Rule[]) pattern.toArray(new Rule[pattern.size()]);
        this.mRules = ruleArr;
        int length = ruleArr.length;
        int iEstimateLength = 0;
        while (true) {
            length--;
            if (length < 0) {
                this.mMaxLengthEstimate = iEstimateLength;
                return;
            }
            iEstimateLength += this.mRules[length].estimateLength();
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        init();
    }

    public StringBuffer applyRules(Calendar calendar, StringBuffer stringBuffer) {
        for (Rule rule : this.mRules) {
            rule.appendTo(stringBuffer, calendar);
        }
        return stringBuffer;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof FastDateFormat)) {
            return false;
        }
        FastDateFormat fastDateFormat = (FastDateFormat) obj;
        return this.mPattern.equals(fastDateFormat.mPattern) && this.mTimeZone.equals(fastDateFormat.mTimeZone) && this.mLocale.equals(fastDateFormat.mLocale);
    }

    @Override // java.text.Format
    public StringBuffer format(Object obj, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        if (obj instanceof Date) {
            return format((Date) obj, stringBuffer);
        }
        if (obj instanceof Calendar) {
            return format((Calendar) obj, stringBuffer);
        }
        if (obj instanceof Long) {
            return format(((Long) obj).longValue(), stringBuffer);
        }
        throw new IllegalArgumentException("Unknown class: ".concat(obj == null ? "<null>" : obj.getClass().getName()));
    }

    public Locale getLocale() {
        return this.mLocale;
    }

    public int getMaxLengthEstimate() {
        return this.mMaxLengthEstimate;
    }

    public String getPattern() {
        return this.mPattern;
    }

    public TimeZone getTimeZone() {
        return this.mTimeZone;
    }

    public int hashCode() {
        return (((this.mLocale.hashCode() * 13) + this.mTimeZone.hashCode()) * 13) + this.mPattern.hashCode();
    }

    @Override // java.text.Format
    public Object parseObject(String str, ParsePosition parsePosition) {
        parsePosition.setIndex(0);
        parsePosition.setErrorIndex(0);
        return null;
    }

    public List<Rule> parsePattern() {
        int i10;
        Rule ruleSelectNumberRule;
        Rule timeZoneNameRule;
        DateFormatSymbols dateFormatSymbols = new DateFormatSymbols(this.mLocale);
        ArrayList arrayList = new ArrayList();
        String[] eras = dateFormatSymbols.getEras();
        String[] months = dateFormatSymbols.getMonths();
        String[] shortMonths = dateFormatSymbols.getShortMonths();
        String[] weekdays = dateFormatSymbols.getWeekdays();
        String[] shortWeekdays = dateFormatSymbols.getShortWeekdays();
        String[] amPmStrings = dateFormatSymbols.getAmPmStrings();
        int length = this.mPattern.length();
        int i11 = 0;
        while (i11 < length) {
            int[] iArr = {i11};
            String token = parseToken(this.mPattern, iArr);
            int i12 = iArr[0];
            int length2 = token.length();
            if (length2 == 0) {
                return arrayList;
            }
            char cCharAt = token.charAt(0);
            if (cCharAt != 'y') {
                if (cCharAt != 'z') {
                    switch (cCharAt) {
                        case '\'':
                            String strSubstring = token.substring(1);
                            ruleSelectNumberRule = strSubstring.length() != 1 ? new StringLiteral(strSubstring) : new CharacterLiteral(strSubstring.charAt(0));
                            break;
                        case 'K':
                            timeZoneNameRule = selectNumberRule(10, length2);
                            break;
                        case 'M':
                            timeZoneNameRule = length2 < 4 ? length2 != 3 ? length2 != 2 ? UnpaddedMonthField.INSTANCE : TwoDigitMonthField.INSTANCE : new TextField(2, shortMonths) : new TextField(2, months);
                            break;
                        case 'S':
                            timeZoneNameRule = selectNumberRule(14, length2);
                            break;
                        case 'W':
                            timeZoneNameRule = selectNumberRule(4, length2);
                            break;
                        case 'Z':
                            timeZoneNameRule = length2 != 1 ? TimeZoneNumberRule.INSTANCE_COLON : TimeZoneNumberRule.INSTANCE_NO_COLON;
                            break;
                        case 'a':
                            timeZoneNameRule = new TextField(9, amPmStrings);
                            break;
                        case 'd':
                            timeZoneNameRule = selectNumberRule(5, length2);
                            break;
                        case 'h':
                            timeZoneNameRule = new TwelveHourField(selectNumberRule(10, length2));
                            break;
                        case 'k':
                            timeZoneNameRule = new TwentyFourHourField(selectNumberRule(11, length2));
                            break;
                        case 'm':
                            timeZoneNameRule = selectNumberRule(12, length2);
                            break;
                        case 's':
                            timeZoneNameRule = selectNumberRule(13, length2);
                            break;
                        case 'w':
                            timeZoneNameRule = selectNumberRule(3, length2);
                            break;
                        default:
                            switch (cCharAt) {
                                case 'D':
                                    timeZoneNameRule = selectNumberRule(6, length2);
                                    break;
                                case 'E':
                                    timeZoneNameRule = new TextField(7, length2 < 4 ? shortWeekdays : weekdays);
                                    break;
                                case 'F':
                                    timeZoneNameRule = selectNumberRule(8, length2);
                                    break;
                                case 'G':
                                    timeZoneNameRule = new TextField(0, eras);
                                    break;
                                case 'H':
                                    timeZoneNameRule = selectNumberRule(11, length2);
                                    break;
                                default:
                                    throw new IllegalArgumentException("Illegal pattern component: ".concat(token));
                            }
                            break;
                    }
                } else if (length2 >= 4) {
                    ruleSelectNumberRule = new TimeZoneNameRule(this.mTimeZone, this.mLocale, 1);
                    i10 = 1;
                    arrayList.add(ruleSelectNumberRule);
                    i11 = i12 + i10;
                } else {
                    timeZoneNameRule = new TimeZoneNameRule(this.mTimeZone, this.mLocale, 0);
                }
                ruleSelectNumberRule = timeZoneNameRule;
            } else if (length2 == 2) {
                timeZoneNameRule = TwoDigitYearField.INSTANCE;
                ruleSelectNumberRule = timeZoneNameRule;
            } else {
                if (length2 < 4) {
                    length2 = 4;
                }
                i10 = 1;
                ruleSelectNumberRule = selectNumberRule(1, length2);
                arrayList.add(ruleSelectNumberRule);
                i11 = i12 + i10;
            }
            i10 = 1;
            arrayList.add(ruleSelectNumberRule);
            i11 = i12 + i10;
        }
        return arrayList;
    }

    public String parseToken(String str, int[] iArr) {
        StringBuilder sb2 = new StringBuilder();
        int i10 = iArr[0];
        int length = str.length();
        char cCharAt = str.charAt(i10);
        if ((cCharAt < 'A' || cCharAt > 'Z') && (cCharAt < 'a' || cCharAt > 'z')) {
            sb2.append('\'');
            boolean z10 = false;
            while (i10 < length) {
                char cCharAt2 = str.charAt(i10);
                if (cCharAt2 != '\'') {
                    if (!z10 && ((cCharAt2 >= 'A' && cCharAt2 <= 'Z') || (cCharAt2 >= 'a' && cCharAt2 <= 'z'))) {
                        i10--;
                        break;
                    }
                    sb2.append(cCharAt2);
                } else {
                    int i11 = i10 + 1;
                    if (i11 >= length || str.charAt(i11) != '\'') {
                        z10 = !z10;
                    } else {
                        sb2.append(cCharAt2);
                        i10 = i11;
                    }
                }
                i10++;
            }
        } else {
            sb2.append(cCharAt);
            while (true) {
                int i12 = i10 + 1;
                if (i12 >= length || str.charAt(i12) != cCharAt) {
                    break;
                }
                sb2.append(cCharAt);
                i10 = i12;
            }
        }
        iArr[0] = i10;
        return sb2.toString();
    }

    public NumberRule selectNumberRule(int i10, int i11) {
        return i11 != 1 ? i11 != 2 ? new PaddedNumberField(i10, i11) : new TwoDigitNumberField(i10) : new UnpaddedNumberField(i10);
    }

    public String toString() {
        return e.a(new StringBuilder("FastDateFormat["), this.mPattern, "]");
    }

    public static FastDateFormat getDateInstance(int i10, Locale locale) {
        return (FastDateFormat) cache.getDateTimeInstance(Integer.valueOf(i10), null, null, locale);
    }

    public static FastDateFormat getDateTimeInstance(int i10, int i11, Locale locale) {
        return (FastDateFormat) cache.getDateTimeInstance(Integer.valueOf(i10), Integer.valueOf(i11), null, locale);
    }

    public static FastDateFormat getInstance(String str) {
        return (FastDateFormat) cache.getInstance(str, null, null);
    }

    public static FastDateFormat getTimeInstance(int i10, Locale locale) {
        return (FastDateFormat) cache.getDateTimeInstance(null, Integer.valueOf(i10), null, locale);
    }

    public static class TwelveHourField implements NumberRule {
        private final NumberRule mRule;

        public TwelveHourField(NumberRule numberRule) {
            this.mRule = numberRule;
        }

        @Override // org.apache.commons.lang3.time.FastDateFormat.Rule
        public void appendTo(StringBuffer stringBuffer, Calendar calendar) {
            int leastMaximum = calendar.get(10);
            if (leastMaximum == 0) {
                leastMaximum = calendar.getLeastMaximum(10) + 1;
            }
            this.mRule.appendTo(stringBuffer, leastMaximum);
        }

        @Override // org.apache.commons.lang3.time.FastDateFormat.Rule
        public int estimateLength() {
            return this.mRule.estimateLength();
        }

        @Override // org.apache.commons.lang3.time.FastDateFormat.NumberRule
        public void appendTo(StringBuffer stringBuffer, int i10) {
            this.mRule.appendTo(stringBuffer, i10);
        }
    }

    public static class TwentyFourHourField implements NumberRule {
        private final NumberRule mRule;

        public TwentyFourHourField(NumberRule numberRule) {
            this.mRule = numberRule;
        }

        @Override // org.apache.commons.lang3.time.FastDateFormat.Rule
        public void appendTo(StringBuffer stringBuffer, Calendar calendar) {
            int maximum = calendar.get(11);
            if (maximum == 0) {
                maximum = calendar.getMaximum(11) + 1;
            }
            this.mRule.appendTo(stringBuffer, maximum);
        }

        @Override // org.apache.commons.lang3.time.FastDateFormat.Rule
        public int estimateLength() {
            return this.mRule.estimateLength();
        }

        @Override // org.apache.commons.lang3.time.FastDateFormat.NumberRule
        public void appendTo(StringBuffer stringBuffer, int i10) {
            this.mRule.appendTo(stringBuffer, i10);
        }
    }

    public static FastDateFormat getDateInstance(int i10, TimeZone timeZone) {
        return (FastDateFormat) cache.getDateTimeInstance(Integer.valueOf(i10), null, timeZone, null);
    }

    public static FastDateFormat getDateTimeInstance(int i10, int i11, TimeZone timeZone) {
        return getDateTimeInstance(i10, i11, timeZone, null);
    }

    public static FastDateFormat getInstance(String str, TimeZone timeZone) {
        return (FastDateFormat) cache.getInstance(str, timeZone, null);
    }

    public static FastDateFormat getTimeInstance(int i10, TimeZone timeZone) {
        return (FastDateFormat) cache.getDateTimeInstance(null, Integer.valueOf(i10), timeZone, null);
    }

    public static FastDateFormat getDateInstance(int i10, TimeZone timeZone, Locale locale) {
        return (FastDateFormat) cache.getDateTimeInstance(Integer.valueOf(i10), null, timeZone, locale);
    }

    public static FastDateFormat getDateTimeInstance(int i10, int i11, TimeZone timeZone, Locale locale) {
        return (FastDateFormat) cache.getDateTimeInstance(Integer.valueOf(i10), Integer.valueOf(i11), timeZone, locale);
    }

    public static FastDateFormat getInstance(String str, Locale locale) {
        return (FastDateFormat) cache.getInstance(str, null, locale);
    }

    public static FastDateFormat getTimeInstance(int i10, TimeZone timeZone, Locale locale) {
        return (FastDateFormat) cache.getDateTimeInstance(null, Integer.valueOf(i10), timeZone, locale);
    }

    public static FastDateFormat getInstance(String str, TimeZone timeZone, Locale locale) {
        return (FastDateFormat) cache.getInstance(str, timeZone, locale);
    }

    public String format(long j10) {
        return format(new Date(j10));
    }

    public String format(Date date) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(this.mTimeZone, this.mLocale);
        gregorianCalendar.setTime(date);
        return applyRules(gregorianCalendar, new StringBuffer(this.mMaxLengthEstimate)).toString();
    }

    public String format(Calendar calendar) {
        return format(calendar, new StringBuffer(this.mMaxLengthEstimate)).toString();
    }

    public StringBuffer format(long j10, StringBuffer stringBuffer) {
        return format(new Date(j10), stringBuffer);
    }

    public StringBuffer format(Date date, StringBuffer stringBuffer) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(this.mTimeZone, this.mLocale);
        gregorianCalendar.setTime(date);
        return applyRules(gregorianCalendar, stringBuffer);
    }

    public StringBuffer format(Calendar calendar, StringBuffer stringBuffer) {
        return applyRules(calendar, stringBuffer);
    }
}
