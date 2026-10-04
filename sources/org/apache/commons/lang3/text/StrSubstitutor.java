package org.apache.commons.lang3.text;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

/* JADX INFO: loaded from: classes6.dex */
public class StrSubstitutor {
    public static final char DEFAULT_ESCAPE = '$';
    public static final StrMatcher DEFAULT_PREFIX = StrMatcher.stringMatcher("${");
    public static final StrMatcher DEFAULT_SUFFIX = StrMatcher.stringMatcher("}");
    private boolean enableSubstitutionInVariables;
    private char escapeChar;
    private StrMatcher prefixMatcher;
    private StrMatcher suffixMatcher;
    private StrLookup<?> variableResolver;

    public StrSubstitutor() {
        this((StrLookup<?>) null, DEFAULT_PREFIX, DEFAULT_SUFFIX, '$');
    }

    private void checkCyclicSubstitution(String str, List<String> list) {
        if (list.contains(str)) {
            StrBuilder strBuilder = new StrBuilder(256);
            strBuilder.append("Infinite loop in property interpolation of ");
            strBuilder.append(list.remove(0));
            strBuilder.append(": ");
            strBuilder.appendWithSeparators(list, "->");
            throw new IllegalStateException(strBuilder.toString());
        }
    }

    public static <V> String replace(Object obj, Map<String, V> map) {
        return new StrSubstitutor(map).replace(obj);
    }

    public static String replaceSystemProperties(Object obj) {
        return new StrSubstitutor(StrLookup.systemPropertiesLookup()).replace(obj);
    }

    public char getEscapeChar() {
        return this.escapeChar;
    }

    public StrMatcher getVariablePrefixMatcher() {
        return this.prefixMatcher;
    }

    public StrLookup<?> getVariableResolver() {
        return this.variableResolver;
    }

    public StrMatcher getVariableSuffixMatcher() {
        return this.suffixMatcher;
    }

    public boolean isEnableSubstitutionInVariables() {
        return this.enableSubstitutionInVariables;
    }

    public boolean replaceIn(StringBuffer stringBuffer) {
        if (stringBuffer == null) {
            return false;
        }
        return replaceIn(stringBuffer, 0, stringBuffer.length());
    }

    public String resolveVariable(String str, StrBuilder strBuilder, int i10, int i11) {
        StrLookup<?> variableResolver = getVariableResolver();
        if (variableResolver == null) {
            return null;
        }
        return variableResolver.lookup(str);
    }

    public void setEnableSubstitutionInVariables(boolean z10) {
        this.enableSubstitutionInVariables = z10;
    }

    public void setEscapeChar(char c10) {
        this.escapeChar = c10;
    }

    public StrSubstitutor setVariablePrefix(char c10) {
        return setVariablePrefixMatcher(StrMatcher.charMatcher(c10));
    }

    public StrSubstitutor setVariablePrefixMatcher(StrMatcher strMatcher) {
        if (strMatcher == null) {
            throw new IllegalArgumentException("Variable prefix matcher must not be null!");
        }
        this.prefixMatcher = strMatcher;
        return this;
    }

    public void setVariableResolver(StrLookup<?> strLookup) {
        this.variableResolver = strLookup;
    }

    public StrSubstitutor setVariableSuffix(char c10) {
        return setVariableSuffixMatcher(StrMatcher.charMatcher(c10));
    }

    public StrSubstitutor setVariableSuffixMatcher(StrMatcher strMatcher) {
        if (strMatcher == null) {
            throw new IllegalArgumentException("Variable suffix matcher must not be null!");
        }
        this.suffixMatcher = strMatcher;
        return this;
    }

    public boolean substitute(StrBuilder strBuilder, int i10, int i11) {
        return substitute(strBuilder, i10, i11, null) > 0;
    }

    public <V> StrSubstitutor(Map<String, V> map) {
        this((StrLookup<?>) StrLookup.mapLookup(map), DEFAULT_PREFIX, DEFAULT_SUFFIX, '$');
    }

    public static <V> String replace(Object obj, Map<String, V> map, String str, String str2) {
        return new StrSubstitutor(map, str, str2).replace(obj);
    }

    private int substitute(StrBuilder strBuilder, int i10, int i11, List<String> list) {
        int i12;
        StrMatcher strMatcher;
        StrMatcher strMatcher2;
        int iIsMatch;
        boolean z10;
        StrMatcher variablePrefixMatcher = getVariablePrefixMatcher();
        StrMatcher variableSuffixMatcher = getVariableSuffixMatcher();
        char escapeChar = getEscapeChar();
        boolean z11 = list == null;
        int i13 = i10;
        int i14 = i10 + i11;
        int i15 = 0;
        int i16 = 0;
        char[] cArr = strBuilder.buffer;
        List<String> list2 = list;
        while (i13 < i14) {
            int iIsMatch2 = variablePrefixMatcher.isMatch(cArr, i13, i10, i14);
            if (iIsMatch2 == 0) {
                i13++;
                strMatcher = variablePrefixMatcher;
                strMatcher2 = variableSuffixMatcher;
            } else {
                if (i13 > i10) {
                    i12 = 1;
                    int i17 = i13 - 1;
                    if (cArr[i17] == escapeChar) {
                        strBuilder.deleteCharAt(i17);
                        i15--;
                        i14--;
                        strMatcher = variablePrefixMatcher;
                        strMatcher2 = variableSuffixMatcher;
                        cArr = strBuilder.buffer;
                        i16 = 1;
                    }
                } else {
                    i12 = 1;
                }
                int i18 = i13 + iIsMatch2;
                int i19 = i18;
                int i20 = 0;
                while (true) {
                    if (i19 >= i14) {
                        strMatcher = variablePrefixMatcher;
                        strMatcher2 = variableSuffixMatcher;
                        i13 = i19;
                        break;
                    }
                    if (!isEnableSubstitutionInVariables() || (iIsMatch = variablePrefixMatcher.isMatch(cArr, i19, i10, i14)) == 0) {
                        iIsMatch = variableSuffixMatcher.isMatch(cArr, i19, i10, i14);
                        if (iIsMatch == 0) {
                            i19++;
                        } else if (i20 == 0) {
                            strMatcher = variablePrefixMatcher;
                            strMatcher2 = variableSuffixMatcher;
                            String str = new String(cArr, i18, (i19 - i13) - iIsMatch2);
                            if (isEnableSubstitutionInVariables()) {
                                StrBuilder strBuilder2 = new StrBuilder(str);
                                z10 = false;
                                substitute(strBuilder2, 0, strBuilder2.length());
                                str = strBuilder2.toString();
                            } else {
                                z10 = false;
                            }
                            int i21 = i19 + iIsMatch;
                            list2 = list2;
                            if (list2 == null) {
                                ArrayList arrayList = new ArrayList();
                                arrayList.add(new String(cArr, i10, i11));
                                list2 = arrayList;
                            }
                            checkCyclicSubstitution(str, list2);
                            list2.add(str);
                            String strResolveVariable = resolveVariable(str, strBuilder, i13, i21);
                            if (strResolveVariable != null) {
                                int length = strResolveVariable.length();
                                strBuilder.replace(i13, i21, strResolveVariable);
                                int iSubstitute = (length - (i21 - i13)) + substitute(strBuilder, i13, length, list2);
                                i21 += iSubstitute;
                                i14 += iSubstitute;
                                i15 += iSubstitute;
                                cArr = strBuilder.buffer;
                                i16 = i12;
                            }
                            i13 = i21;
                            list2.remove(list2.size() - 1);
                        } else {
                            i20--;
                        }
                    } else {
                        i20++;
                    }
                    i19 += iIsMatch;
                }
                variablePrefixMatcher = strMatcher;
                variableSuffixMatcher = strMatcher2;
                list2 = list2;
            }
            variablePrefixMatcher = strMatcher;
            variableSuffixMatcher = strMatcher2;
            list2 = list2;
        }
        return z11 ? i16 : i15;
    }

    public boolean replaceIn(StringBuffer stringBuffer, int i10, int i11) {
        if (stringBuffer == null) {
            return false;
        }
        StrBuilder strBuilderAppend = new StrBuilder(i11).append(stringBuffer, i10, i11);
        if (!substitute(strBuilderAppend, 0, i11)) {
            return false;
        }
        stringBuffer.replace(i10, i11 + i10, strBuilderAppend.toString());
        return true;
    }

    public StrSubstitutor setVariablePrefix(String str) {
        if (str != null) {
            return setVariablePrefixMatcher(StrMatcher.stringMatcher(str));
        }
        throw new IllegalArgumentException("Variable prefix must not be null!");
    }

    public StrSubstitutor setVariableSuffix(String str) {
        if (str != null) {
            return setVariableSuffixMatcher(StrMatcher.stringMatcher(str));
        }
        throw new IllegalArgumentException("Variable suffix must not be null!");
    }

    public <V> StrSubstitutor(Map<String, V> map, String str, String str2) {
        this((StrLookup<?>) StrLookup.mapLookup(map), str, str2, '$');
    }

    public static String replace(Object obj, Properties properties) {
        if (properties == null) {
            return obj.toString();
        }
        HashMap map = new HashMap();
        Enumeration<?> enumerationPropertyNames = properties.propertyNames();
        while (enumerationPropertyNames.hasMoreElements()) {
            String str = (String) enumerationPropertyNames.nextElement();
            map.put(str, properties.getProperty(str));
        }
        return replace(obj, map);
    }

    public <V> StrSubstitutor(Map<String, V> map, String str, String str2, char c10) {
        this((StrLookup<?>) StrLookup.mapLookup(map), str, str2, c10);
    }

    public StrSubstitutor(StrLookup<?> strLookup) {
        this(strLookup, DEFAULT_PREFIX, DEFAULT_SUFFIX, '$');
    }

    public boolean replaceIn(StrBuilder strBuilder) {
        if (strBuilder == null) {
            return false;
        }
        return substitute(strBuilder, 0, strBuilder.length());
    }

    public StrSubstitutor(StrLookup<?> strLookup, String str, String str2, char c10) {
        setVariableResolver(strLookup);
        setVariablePrefix(str);
        setVariableSuffix(str2);
        setEscapeChar(c10);
    }

    public boolean replaceIn(StrBuilder strBuilder, int i10, int i11) {
        if (strBuilder == null) {
            return false;
        }
        return substitute(strBuilder, i10, i11);
    }

    public StrSubstitutor(StrLookup<?> strLookup, StrMatcher strMatcher, StrMatcher strMatcher2, char c10) {
        setVariableResolver(strLookup);
        setVariablePrefixMatcher(strMatcher);
        setVariableSuffixMatcher(strMatcher2);
        setEscapeChar(c10);
    }

    public String replace(String str) {
        if (str == null) {
            return null;
        }
        StrBuilder strBuilder = new StrBuilder(str);
        return !substitute(strBuilder, 0, str.length()) ? str : strBuilder.toString();
    }

    public String replace(String str, int i10, int i11) {
        if (str == null) {
            return null;
        }
        StrBuilder strBuilderAppend = new StrBuilder(i11).append(str, i10, i11);
        if (!substitute(strBuilderAppend, 0, i11)) {
            return str.substring(i10, i11 + i10);
        }
        return strBuilderAppend.toString();
    }

    public String replace(char[] cArr) {
        if (cArr == null) {
            return null;
        }
        StrBuilder strBuilderAppend = new StrBuilder(cArr.length).append(cArr);
        substitute(strBuilderAppend, 0, cArr.length);
        return strBuilderAppend.toString();
    }

    public String replace(char[] cArr, int i10, int i11) {
        if (cArr == null) {
            return null;
        }
        StrBuilder strBuilderAppend = new StrBuilder(i11).append(cArr, i10, i11);
        substitute(strBuilderAppend, 0, i11);
        return strBuilderAppend.toString();
    }

    public String replace(StringBuffer stringBuffer) {
        if (stringBuffer == null) {
            return null;
        }
        StrBuilder strBuilderAppend = new StrBuilder(stringBuffer.length()).append(stringBuffer);
        substitute(strBuilderAppend, 0, strBuilderAppend.length());
        return strBuilderAppend.toString();
    }

    public String replace(StringBuffer stringBuffer, int i10, int i11) {
        if (stringBuffer == null) {
            return null;
        }
        StrBuilder strBuilderAppend = new StrBuilder(i11).append(stringBuffer, i10, i11);
        substitute(strBuilderAppend, 0, i11);
        return strBuilderAppend.toString();
    }

    public String replace(StrBuilder strBuilder) {
        if (strBuilder == null) {
            return null;
        }
        StrBuilder strBuilderAppend = new StrBuilder(strBuilder.length()).append(strBuilder);
        substitute(strBuilderAppend, 0, strBuilderAppend.length());
        return strBuilderAppend.toString();
    }

    public String replace(StrBuilder strBuilder, int i10, int i11) {
        if (strBuilder == null) {
            return null;
        }
        StrBuilder strBuilderAppend = new StrBuilder(i11).append(strBuilder, i10, i11);
        substitute(strBuilderAppend, 0, i11);
        return strBuilderAppend.toString();
    }

    public String replace(Object obj) {
        if (obj == null) {
            return null;
        }
        StrBuilder strBuilderAppend = new StrBuilder().append(obj);
        substitute(strBuilderAppend, 0, strBuilderAppend.length());
        return strBuilderAppend.toString();
    }
}
