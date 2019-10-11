package strings;

public class DuplicateCharFromString {

	public static void main(String[] args) {
		String s ="pankajppppppppppppppppp@#$#%%@!ppppppppppppppppppzpptpppipppfpppsppppp";
		char [] a = s.toCharArray();
		int count=1;
		 for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				 if (a[i]==a[j]) {
					count++;
					a[j]=' ';
				}
			}
			if (a[i]==' ') {
				
			}
			else if(count>1) {
				System.out.println("duplicate char in string is : "+a[i]+ " = "+count);
			}count=1;
		}
	}

}
