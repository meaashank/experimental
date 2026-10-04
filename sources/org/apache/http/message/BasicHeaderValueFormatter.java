package org.apache.http.message;

import U6.j;
import com.bytedance.sdk.component.utils.a;
import org.apache.http.HeaderElement;
import org.apache.http.NameValuePair;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.util.Args;
import org.apache.http.util.CharArrayBuffer;
import org.objectweb.asm.signature.SignatureVisitor;

/* JADX INFO: loaded from: classes6.dex */
@Contract(threading = ThreadingBehavior.IMMUTABLE)
public class BasicHeaderValueFormatter implements HeaderValueFormatter {

    @Deprecated
    public static final BasicHeaderValueFormatter DEFAULT = new BasicHeaderValueFormatter();
    public static final BasicHeaderValueFormatter INSTANCE = new BasicHeaderValueFormatter();
    public static final String SEPARATORS = " ;,:@()<>\\\"/[]?={}\t";
    public static final String UNSAFE_CHARS = "\"\\";

    public static String formatElements(HeaderElement[] headerElementArr, boolean z10, HeaderValueFormatter headerValueFormatter) {
        if (headerValueFormatter == null) {
            headerValueFormatter = INSTANCE;
        }
        return headerValueFormatter.formatElements(null, headerElementArr, z10).toString();
    }

    public static String formatHeaderElement(HeaderElement headerElement, boolean z10, HeaderValueFormatter headerValueFormatter) {
        if (headerValueFormatter == null) {
            headerValueFormatter = INSTANCE;
        }
        return headerValueFormatter.formatHeaderElement(null, headerElement, z10).toString();
    }

    public static String formatNameValuePair(NameValuePair nameValuePair, boolean z10, HeaderValueFormatter headerValueFormatter) {
        if (headerValueFormatter == null) {
            headerValueFormatter = INSTANCE;
        }
        return headerValueFormatter.formatNameValuePair(null, nameValuePair, z10).toString();
    }

    public static String formatParameters(NameValuePair[] nameValuePairArr, boolean z10, HeaderValueFormatter headerValueFormatter) {
        if (headerValueFormatter == null) {
            headerValueFormatter = INSTANCE;
        }
        return headerValueFormatter.formatParameters(null, nameValuePairArr, z10).toString();
    }

    public void doFormatValue(CharArrayBuffer charArrayBuffer, String str, boolean z10) {
        if (!z10) {
            for (int i10 = 0; i10 < str.length() && !z10; i10++) {
                z10 = isSeparator(str.charAt(i10));
            }
        }
        if (z10) {
            charArrayBuffer.append('\"');
        }
        for (int i11 = 0; i11 < str.length(); i11++) {
            char cCharAt = str.charAt(i11);
            if (isUnsafe(cCharAt)) {
                charArrayBuffer.append('\\');
            }
            charArrayBuffer.append(cCharAt);
        }
        if (z10) {
            charArrayBuffer.append('\"');
        }
    }

    public int estimateElementsLen(HeaderElement[] headerElementArr) {
        if (headerElementArr == null || headerElementArr.length < 1) {
            return 0;
        }
        int length = (headerElementArr.length - 1) * 2;
        for (HeaderElement headerElement : headerElementArr) {
            length += estimateHeaderElementLen(headerElement);
        }
        return length;
    }

    public int estimateHeaderElementLen(HeaderElement headerElement) {
        if (headerElement == null) {
            return 0;
        }
        int length = headerElement.getName().length();
        String value = headerElement.getValue();
        if (value != null) {
            length = a.a(value, 3, length);
        }
        int parameterCount = headerElement.getParameterCount();
        if (parameterCount > 0) {
            for (int i10 = 0; i10 < parameterCount; i10++) {
                length += estimateNameValuePairLen(headerElement.getParameter(i10)) + 2;
            }
        }
        return length;
    }

    public int estimateNameValuePairLen(NameValuePair nameValuePair) {
        if (nameValuePair == null) {
            return 0;
        }
        int length = nameValuePair.getName().length();
        String value = nameValuePair.getValue();
        return value != null ? a.a(value, 3, length) : length;
    }

    public int estimateParametersLen(NameValuePair[] nameValuePairArr) {
        if (nameValuePairArr == null || nameValuePairArr.length < 1) {
            return 0;
        }
        int length = (nameValuePairArr.length - 1) * 2;
        for (NameValuePair nameValuePair : nameValuePairArr) {
            length += estimateNameValuePairLen(nameValuePair);
        }
        return length;
    }

    public boolean isSeparator(char c10) {
        return SEPARATORS.indexOf(c10) >= 0;
    }

    public boolean isUnsafe(char c10) {
        return UNSAFE_CHARS.indexOf(c10) >= 0;
    }

    @Override // org.apache.http.message.HeaderValueFormatter
    public CharArrayBuffer formatElements(CharArrayBuffer charArrayBuffer, HeaderElement[] headerElementArr, boolean z10) {
        Args.notNull(headerElementArr, "Header element array");
        int iEstimateElementsLen = estimateElementsLen(headerElementArr);
        if (charArrayBuffer == null) {
            charArrayBuffer = new CharArrayBuffer(iEstimateElementsLen);
        } else {
            charArrayBuffer.ensureCapacity(iEstimateElementsLen);
        }
        for (int i10 = 0; i10 < headerElementArr.length; i10++) {
            if (i10 > 0) {
                charArrayBuffer.append(j.f68738d);
            }
            formatHeaderElement(charArrayBuffer, headerElementArr[i10], z10);
        }
        return charArrayBuffer;
    }

    @Override // org.apache.http.message.HeaderValueFormatter
    public CharArrayBuffer formatHeaderElement(CharArrayBuffer charArrayBuffer, HeaderElement headerElement, boolean z10) {
        Args.notNull(headerElement, "Header element");
        int iEstimateHeaderElementLen = estimateHeaderElementLen(headerElement);
        if (charArrayBuffer == null) {
            charArrayBuffer = new CharArrayBuffer(iEstimateHeaderElementLen);
        } else {
            charArrayBuffer.ensureCapacity(iEstimateHeaderElementLen);
        }
        charArrayBuffer.append(headerElement.getName());
        String value = headerElement.getValue();
        if (value != null) {
            charArrayBuffer.append(SignatureVisitor.INSTANCEOF);
            doFormatValue(charArrayBuffer, value, z10);
        }
        int parameterCount = headerElement.getParameterCount();
        if (parameterCount > 0) {
            for (int i10 = 0; i10 < parameterCount; i10++) {
                charArrayBuffer.append("; ");
                formatNameValuePair(charArrayBuffer, headerElement.getParameter(i10), z10);
            }
        }
        return charArrayBuffer;
    }

    @Override // org.apache.http.message.HeaderValueFormatter
    public CharArrayBuffer formatNameValuePair(CharArrayBuffer charArrayBuffer, NameValuePair nameValuePair, boolean z10) {
        Args.notNull(nameValuePair, "Name / value pair");
        int iEstimateNameValuePairLen = estimateNameValuePairLen(nameValuePair);
        if (charArrayBuffer == null) {
            charArrayBuffer = new CharArrayBuffer(iEstimateNameValuePairLen);
        } else {
            charArrayBuffer.ensureCapacity(iEstimateNameValuePairLen);
        }
        charArrayBuffer.append(nameValuePair.getName());
        String value = nameValuePair.getValue();
        if (value != null) {
            charArrayBuffer.append(SignatureVisitor.INSTANCEOF);
            doFormatValue(charArrayBuffer, value, z10);
        }
        return charArrayBuffer;
    }

    @Override // org.apache.http.message.HeaderValueFormatter
    public CharArrayBuffer formatParameters(CharArrayBuffer charArrayBuffer, NameValuePair[] nameValuePairArr, boolean z10) {
        Args.notNull(nameValuePairArr, "Header parameter array");
        int iEstimateParametersLen = estimateParametersLen(nameValuePairArr);
        if (charArrayBuffer == null) {
            charArrayBuffer = new CharArrayBuffer(iEstimateParametersLen);
        } else {
            charArrayBuffer.ensureCapacity(iEstimateParametersLen);
        }
        for (int i10 = 0; i10 < nameValuePairArr.length; i10++) {
            if (i10 > 0) {
                charArrayBuffer.append("; ");
            }
            formatNameValuePair(charArrayBuffer, nameValuePairArr[i10], z10);
        }
        return charArrayBuffer;
    }
}
