package Buffered;

/**
 * @quthor Liuzhao
 * @date 2022/7/13
 */
public abstract class Reader_ {
    public static void main(String[] args) {
        new BufferedReader(new FileReader_()).read();
        new BufferedReader(new StringReader_()).read();
    }
    public abstract void read();
}
class StringReader_ extends Reader_{

    @Override
    public void read() {
        System.out.println("读取字符串流");
    }
}
class FileReader_ extends Reader_{

    @Override
    public void read() {
        System.out.println("读取文件流");
    }
}

class BufferedReader extends Reader_{
    private Reader_ reader_;


    public BufferedReader(Reader_ reader_) {
        this.reader_ = reader_;
    }

    @Override
    public void read() {
        reader_.read();
    }
}