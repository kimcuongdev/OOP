import java.util.ArrayList;

public class Chapter  {
    public ArrayList<Page> danhSachTrang;
    public String tenChapter;
    public Chapter()
    {
        this.danhSachTrang = new ArrayList<Page>();
    }
    public Chapter(ArrayList<Page> danhSachTrang)
    {
        this.danhSachTrang = danhSachTrang;
    }
    public void themTrang(Page pg)
    {
        this.danhSachTrang.add(pg);
    }
    public int demSoTrang()
    {
        return this.danhSachTrang.size();
    }
}
