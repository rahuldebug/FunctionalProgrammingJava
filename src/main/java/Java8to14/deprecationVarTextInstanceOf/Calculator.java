package Java8to14.deprecationVarTextInstanceOf;

//the warning will be generated in logs
public class Calculator {
    @Deprecated
    public float calculate(int a, int b, char c) {
        if (c == '+') return a + b;
        if (c == '-') return a - b;
        return 0;
    }

    public float calculate(int a, int b, int c, char d) {
        if (c == '+') return a + b + c;
        if (c == '-') return a - b - c;
        var sum = a + b + c;
        return 0;
    }

    public String getTextBlock() {
        //no slash /n needed looks clean
        var text = """
                {"widget": {
                    "debug": "on",
                    "window": {
                        "title": "Sample Konfabulator Widget",
                        "name": "main_window",
                        "width": 500,
                        "height": 500
                    },
                    "image": {
                        "src": "Images/Sun.png",
                        "name": "sun1",
                        "hOffset": 250,
                        "vOffset": 250,
                        "alignment": "center"
                    },
                    "text": {
                        "data": "Click Here",
                        "size": 36,
                        "style": "bold",
                        "name": "text1",
                        "hOffset": 250,
                        "vOffset": 100,
                        "alignment": "center",
                        "onMouseUp": "sun1.opacity = (sun1.opacity / 100) * 90;"
                    }
                }}
                """;
        if (text instanceof String){System.out.println("text instance od string");}
        return text;
    }
}
