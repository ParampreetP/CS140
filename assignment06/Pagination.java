package exam01;

public class Pagination {
	private int numPages;
	private int numChapters;
	private int[] chapStarts;
	private int[] chapAssigned;
	
	public Pagination(int anumPages, int anumChapters) {
		this.numPages = anumPages;
		this.numChapters = anumChapters;
		
		chapStarts = new int[numChapters +1];
		chapAssigned = new int[numChapters +1];
		
	}
	public void setChapStartPage(int n, int p) {
		chapStarts[n] = p;
	}
	public void assign(int n) {
		chapAssigned[n] = 1;
	}
	public int totalToRead() {
		int totalPagesToRead = 0;
        for (int chapter = 1; chapter < numChapters; chapter++)
        {
            if (chapAssigned[chapter] == 1)
            {
                totalPagesToRead += (chapStarts[chapter + 1] - chapStarts[chapter]);
            }
        }

        if (chapAssigned[numChapters] == 1)
        {
            // +1 to account for the last page
            totalPagesToRead += (numPages - chapStarts[numChapters] + 1);
        }

        return totalPagesToRead;
    }
	public static void main(String[] args) {
		Pagination pagination = new Pagination(158, 4);
		
		pagination.setChapStartPage(1, 1);
		pagination.setChapStartPage(2, 55);
		pagination.setChapStartPage(3, 89);
		pagination.setChapStartPage(4, 128);
		
		pagination.assign(2);
		pagination.assign(4);
		
		System.out.println(pagination.totalToRead());
	}
	}

