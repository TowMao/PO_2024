using System;
using System.Windows.Forms;

namespace AISD_bubble_sort
{
	public partial class Form1 : Form
	{
		public Form1()
		{
			InitializeComponent();
		}

		private void textBox2_TextChanged(object sender, EventArgs e)
		{

		}

		private void button1_Click(object sender, EventArgs e)
		{
			string numbers_string = textBox2.Text;
			string[] nums = numbers_string.Split(',', ' ');
			int[] nums_int = new int[nums.Length];
			for (int i = 0; i < nums.Length; i++)
			{
				nums_int[i] = int.Parse(nums[i]);
			}
			bubble_sort(nums_int);
			string output = string.Join("<", nums_int);
			textBox1.Text = output;
		}
		private void bubble_sort(int[] nums)
		{
			int len = nums.Length;
			for (int i = 0; i < len - 1; i++)
			{
				for (int j = 0; j < len - i - 1; j++)
				{
					if (nums[j] > nums[j + 1])
					{
						int temp = nums[j];
						nums[j] = nums[j + 1];
						nums[j + 1] = temp;
					}
				}
			}
		}
	}
}
