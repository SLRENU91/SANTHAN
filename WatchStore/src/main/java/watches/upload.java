package watches;
import org.springframework.web.multipart.MultipartFile;
import java.util.List;
public class upload {
private List<MultipartFile> file;

public List<MultipartFile> getFile() {
	return file;
}

public void setFile(List<MultipartFile> file) {
	this.file = file;
}

}

