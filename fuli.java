





#include<stdio.h>
#include<math.h>
void view()
{
    printf("              |                 ��/��������                 |\n");
    printf("              |1.��������                                   |\n");
    printf("              |2.��������                                   |\n");
    printf("              |0.�˳�ϵͳ                                   |\n");
 
}
 
main()
{
    int i,n,m;
    double v,money;  //����
    int years;    //��Ǯ����
    double sum;  //����ܶ�
    double r;   //����
    while(1)
    {
        view();
        printf("ѡ����(0-2):");
        scanf("%d",&n);
        switch(n)
        {
    case 1:
        printf("�����뱾��:");
        scanf("%lf",&money);
          printf("�������Ǯ����:");
        scanf("%d",&years);
        printf("����������:");
        scanf("%lf",&r);
        for(i = 1 ; i<=years; i++)
        {
            sum = r*i*money+money; 
            printf("�����%d���Ĵ���ܶ�Ϊ:%.2lf\n",i,sum);
        }
        printf("\n\n\n");
        break;
    case 2:
        printf("��ѡ��:\n");
        printf("1.ͨ�����������ܶ�\n");
        printf("2.ͨ��Ŀ���ܶ��󱾽�\n\n");
        scanf("%d",&m);
        switch(m)
        {
        case 1:
            printf("�����뱾��:");
               scanf("%lf",&money);
            printf("�������Ǯ����:");
            scanf("%d",&years);
            printf("����������:");
            scanf("%lf",&r);
            for(i = 1 ; i<=years; i++)
            {
                v=pow(1+r,i);
                sum = v*money; 
                printf("�����%d���Ĵ���ܶ�Ϊ:%.2lf\n",i,sum);
            }
            printf("\n\n\n");
            break;
        case 2:
            printf("������Ŀ���Ǯ:");
            scanf("%lf",&sum);
            printf("�������Ǯ����:");
            scanf("%d",&years);
            printf("����������:");
            scanf("%lf",&r);
            for(i = 1 ; i<=years; i++)
            {
                v=pow(1+r,i);
            }
            money=sum/v; 
            printf("���ڱ�����뱾��Ϊ:%.2lf\n",money);
            printf("\n\n\n");
            break;
        }
    case 0:
        return 0;
    }
    }
}


����