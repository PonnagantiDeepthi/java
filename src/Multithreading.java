class Download implements Runnable {
    String url;

    public void setUrl(String url) {
        this.url = url;
    }

    public void run() {
        System.out.println("Downloading " + url);

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("Downloaded " + url);
    }
}

public class Multithreading {
    public static void main(String[] args) {
        String[] urls = {"url1", "url2", "url3"};

        for (String url : urls) {
            Download d = new Download();
            d.setUrl(url);
            Thread thread = new Thread(d);
            thread.start();
        }
    }
}



