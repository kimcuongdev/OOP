import java.util.ArrayList;
public class Book {
    public String tenSach;
    public ArrayList<Chapter> danhSachChapter;
    public Book()
    {
        this.danhSachChapter = new ArrayList<Chapter>();
    }
    public Book(ArrayList<Chapter> danhSachChapter)
    {
        this.danhSachChapter = danhSachChapter;
    }
    public void themChapter(Chapter chap)
    {
        this.danhSachChapter.add(chap);
    }
    public int demSoChapter()
    {
        return this.danhSachChapter.size();
    }
    public int demSoTrang()
    {
        int cnt=0;
        for (Chapter chap : danhSachChapter)
        {
            cnt += chap.demSoTrang();
        }
        return cnt;
    }
}